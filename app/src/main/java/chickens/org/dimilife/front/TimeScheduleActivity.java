package chickens.org.dimilife.front;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import chickens.org.dimilife.R;

public class TimeScheduleActivity extends AppCompatActivity {

    private Spinner classSpinner,gradeSpinner;
    private Button btn;
    private ImageView imageView;
    private static final String[] grade = {"1", "2", "3"};
    private static final String[] classes = {"1", "2", "3","4","5","6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_schedule);

        if (Build.VERSION.SDK_INT >= 21) {   //상태바 색
            getWindow().setStatusBarColor(Color.parseColor("#000000"));
        }

        btn = (Button)findViewById(R.id.searchButton);
        imageView = (ImageView)findViewById(R.id.arrow);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        gradeSpinner = (Spinner)findViewById(R.id.planets_spinner);
        classSpinner = (Spinner)findViewById(R.id.planets_spinner2);
        ArrayAdapter<String>gradeAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,grade);
        ArrayAdapter<String>classAcapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,classes);

        gradeSpinner.setAdapter(gradeAdapter);
        classSpinner.setAdapter(classAcapter);

    }
}
