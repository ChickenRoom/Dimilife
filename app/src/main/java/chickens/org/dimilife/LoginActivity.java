package chickens.org.dimilife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import chickens.org.dimilife.HTTPConnection.LoginService;
import chickens.org.dimilife.HTTPConnection.ServiceGenerator;
import chickens.org.dimilife.HTTPConnection.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText id,pw;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id = (EditText)findViewById(R.id.editText);
        pw = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.button);

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
                Log.e("id",response.body().getEmail());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
