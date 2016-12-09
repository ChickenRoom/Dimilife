package chickens.org.dimilife;

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
import chickens.org.dimilife.HTTPConnection.Stay;
import chickens.org.dimilife.HTTPConnection.StayService;
import chickens.org.dimilife.HTTPConnection.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText id,pw;
    private Button button;
    private TextView textView;
    private String name;
    private ArrayList<String> stayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id = (EditText)findViewById(R.id.editText);
        pw = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

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
}
