package chickens.org.dimilife.front;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chickens.org.dimilife.R;

public class TimeScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_schedule);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


    }
}
