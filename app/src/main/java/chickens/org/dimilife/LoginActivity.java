package chickens.org.dimilife;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import chickens.org.dimilife.HTTPConnection.LoginService;
import chickens.org.dimilife.HTTPConnection.ServiceGenerator;
import chickens.org.dimilife.HTTPConnection.Snack;
import chickens.org.dimilife.HTTPConnection.SnackService;
import chickens.org.dimilife.HTTPConnection.Stay;
import chickens.org.dimilife.HTTPConnection.StayService;
import chickens.org.dimilife.HTTPConnection.User;
import chickens.org.dimilife.front.MainActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText id,pw;
    private Button button;
    private String name;
    private ArrayList<String> stayList = new ArrayList<String>();
    private ArrayList<String> snackList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (Build.VERSION.SDK_INT >= 21) {   //상태바 색
            getWindow().setStatusBarColor(Color.parseColor("#000000"));
        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        id = (EditText)findViewById(R.id.id_edit);
        pw = (EditText)findViewById(R.id.pw_edit);

        putBitmap(R.id.background, R.drawable.back, 8);

        button = (Button)findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doLogin(id.getText().toString(),pw.getText().toString());
            }
        });



    }

    private void doLogin(String id, String pw) {
        LoginService loginService = ServiceGenerator.createService(LoginService.class,"enoxaiming","hkwoo3");
        Call<User> call = loginService.basicLogin(id,pw);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                name = response.body().getName();
                getStay("2016-06-18");
                getSnack(2016,5);
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    private void getStay(String date) {
        StayService stayService = ServiceGenerator.createService(StayService.class,"enoxaiming","hkwoo3");
        Call<List<Stay>> call = stayService.getStay(date);
        call.enqueue(new Callback<List<Stay>>() {
            @Override
            public void onResponse(Call<List<Stay>> call, Response<List<Stay>> response) {
                for(int i = 0; i < response.body().size(); i++) {
                    stayList.add(response.body().get(i).getName());
                }
                if(stayList.contains(name)) {

                }
                else {

                }
            }

            @Override
            public void onFailure(Call<List<Stay>> call, Throwable t) {

            }
        });
    }

    private void getSnack(int year, int month) {
        final SnackService snackService = ServiceGenerator.createService(SnackService.class,"enoxaiming","hkwoo3");
        Call<List<Snack>> call = snackService.getSnack(year,month);
        call.enqueue(new Callback<List<Snack>>() {
            @Override
            public void onResponse(Call<List<Snack>> call, Response<List<Snack>> response) {
                for(int i = 0; i < response.body().size(); i++) {
                    snackList.add(response.body().get(i).getName());
                }
                if(snackList.contains(name)) {

                }
                else {

                }
            }

            @Override
            public void onFailure(Call<List<Snack>> call, Throwable t) {

            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        recycleView(R.id.background);
    }

    private void putBitmap(int imageViewId, int drawableId, int scale) {
        ImageView imageView = (ImageView)findViewById(imageViewId);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = scale;

        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), drawableId, options));
    }

    private void recycleView(int id) {
        ImageView view = (ImageView)findViewById(id);

        Drawable d = view.getDrawable();
        if(d instanceof BitmapDrawable) {
            Bitmap b = ((BitmapDrawable) d).getBitmap();
            view.setImageBitmap(null);
            b.recycle();
            b = null;
        }
        d.setCallback(null);
        System.gc();
        Runtime.getRuntime().gc();
    }
}
