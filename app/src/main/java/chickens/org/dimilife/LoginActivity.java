package chickens.org.dimilife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
    private TextView textView,textView2;
    private String name;
    private ArrayList<String> stayList = new ArrayList<String>();
    private ArrayList<String> snackList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id = (EditText)findViewById(R.id.editText);
        pw = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

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
                    textView.setText("너 잔류");
                }
                else {
                    textView.setText("너 잔류 아니양");
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
                    textView2.setText("너 간식");
                }
                else {
                    textView2.setText("너 간식 아니양");
                }
            }

            @Override
            public void onFailure(Call<List<Snack>> call, Throwable t) {

            }
        });
    }
}
