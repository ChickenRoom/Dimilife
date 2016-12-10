package chickens.org.dimilife.front;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

import chickens.org.dimilife.R;
import chickens.org.dimilife.ScheduleManage;
import chickens.org.dimilife.UserManager;

public class TimeScheduleActivity extends AppCompatActivity {

    private Spinner classSpinner,gradeSpinner;
    private String str;
    private Button btn;
    private ImageView imageView;
    private String[] teachers = new String[7];
    /*private int[] timeLine = {R.id.text1,R.id.text2,R.id.text3,R.id.text4,R.id.text5,R.id.text6,R.id.text7};
    private int[] teacherLine = {R.id.teacher1,R.id.teacher2,R.id.teacher3,R.id.teacher4,R.id.teacher5,R.id.teacher6,R.id.teacher7};
    private int[] edits = {R.id.lunchtext,R.id.dinnertext,R.id.yaja1,R.id.yaja2};*/
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




        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        gradeSpinner = (Spinner)findViewById(R.id.planets_spinner);
        classSpinner = (Spinner)findViewById(R.id.planets_spinner2);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = gradeSpinner.getSelectedItem().toString() + classSpinner.getSelectedItem().toString();
                getTeacherName(getSingleClasses(str));
                Log.e("str",str);
                Log.e("teachers",String.valueOf(getSingleClasses(str).length));
                LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linear);
                for(int i = 0; i < teachers.length; i++) {
                    TextView textView = new TextView(getBaseContext());
                    textView.setText(teachers[i]);
                    textView.setTextColor(getResources().getColor(R.color.buttonSelected));
                    linearLayout.addView(textView);
                    Log.e("int",String.valueOf(i));

                }
            }
        });


        ArrayAdapter<String>gradeAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,grade);
        ArrayAdapter<String>classAcapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,classes);

        gradeSpinner.setAdapter(gradeAdapter);
        classSpinner.setAdapter(classAcapter);

    }

    private String[] getSingleClasses(String serials) {
        //String serials = String.valueOf(serial);
        ScheduleManage schedule = ScheduleManage.getInstance();
        String[] value = null;
        //int cal = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        int cal = 2;

        if(serials.equals("11")) {
            switch (cal) {
                case 2 : value = schedule.getOne_one_mon(); break;
                case 3 : value = schedule.getOne_one_tue(); break;
                case 4 : value = schedule.getOne_one_wed(); break;
                case 5 : value = schedule.getOne_one_thu(); break;
                case 6 : value = schedule.getOne_one_fri(); break;
            }
        }
        else if(serials.equals("12")) {
            switch (cal) {
                case 2 : value = schedule.getOne_two_mon(); break;
                case 3 : value = schedule.getOne_two_tue(); break;
                case 4 : value = schedule.getOne_two_wed(); break;
                case 5 : value = schedule.getOne_two_thu(); break;
                case 6 : value = schedule.getOne_two_fri(); break;
            }
        }
        else if(serials.equals("13")) {
            switch (cal) {
                case 2 : value = schedule.getOne_three_mon(); break;
                case 3 : value = schedule.getOne_three_tue(); break;
                case 4 : value = schedule.getOne_three_wed(); break;
                case 5 : value = schedule.getOne_three_thu(); break;
                case 6 : value = schedule.getOne_three_fri(); break;
            }
        }
        else if(serials.equals("14")) {
            switch (cal) {
                case 2 : value = schedule.getOne_four_mon(); break;
                case 3 : value = schedule.getOne_four_tue(); break;
                case 4 : value = schedule.getOne_four_wed(); break;
                case 5 : value = schedule.getOne_four_thu(); break;
                case 6 : value = schedule.getOne_four_fri(); break;
            }
        }
        else if(serials.equals("15")) {
            switch (cal) {
                case 2 : value = schedule.getOne_five_mon(); break;
                case 3 : value = schedule.getOne_five_tue(); break;
                case 4 : value = schedule.getOne_five_wed(); break;
                case 5 : value = schedule.getOne_five_thu(); break;
                case 6 : value = schedule.getOne_five_fri(); break;
            }
        }
        else if(serials.equals("16")) {
            switch (cal) {
                case 2 : value = schedule.getOne_six_mon(); break;
                case 3 : value = schedule.getOne_six_tue(); break;
                case 4 : value = schedule.getOne_six_wed(); break;
                case 5 : value = schedule.getOne_six_thu(); break;
                case 6 : value = schedule.getOne_six_fri(); break;
            }
        }
        else if(serials.equals("21")) {
            switch (cal) {
                case 2 : value = schedule.getTwo_one_mon(); break;
                case 3 : value = schedule.getTwo_one_tue(); break;
                case 4 : value = schedule.getTwo_one_wed(); break;
                case 5 : value = schedule.getTwo_one_thu(); break;
                case 6 : value = schedule.getTwo_one_fri(); break;
            }
        }
        else if(serials.equals("22")) {
            switch (cal) {
                case 2 : value = schedule.getTwo_two_mon(); break;
                case 3 : value = schedule.getTwo_two_tue(); break;
                case 4 : value = schedule.getTwo_two_wed(); break;
                case 5 : value = schedule.getTwo_two_thu(); break;
                case 6 : value = schedule.getTwo_two_fri(); break;
            }
        }
        else if(serials.equals("23")) {
            switch (cal) {
                case 2 : value = schedule.getTwo_three_mon(); break;
                case 3 : value = schedule.getTwo_three_tue(); break;
                case 4 : value = schedule.getTwo_three_wed(); break;
                case 5 : value = schedule.getTwo_three_thu(); break;
                case 6 : value = schedule.getTwo_three_fri(); break;
            }
        }
        else if(serials.equals("24")) {
            switch (cal) {
                case 2 : value = schedule.getTwo_four_mon(); break;
                case 3 : value = schedule.getTwo_four_tue(); break;
                case 4 : value = schedule.getTwo_four_wed(); break;
                case 5 : value = schedule.getTwo_four_thu(); break;
                case 6 : value = schedule.getTwo_four_fri(); break;
            }
        }
        else if(serials.equals("25")) {
            switch (cal) {
                case 2 : value = schedule.getTwo_five_mon(); break;
                case 3 : value = schedule.getTwo_five_tue(); break;
                case 4 : value = schedule.getTwo_five_wed(); break;
                case 5 : value = schedule.getTwo_five_thu(); break;
                case 6 : value = schedule.getTwo_five_fri(); break;
            }
        }
        else if(serials.equals("26")) {
            switch (cal) {
                case 2 : value = schedule.getTwo_six_mon(); break;
                case 3 : value = schedule.getTwo_six_tue(); break;
                case 4 : value = schedule.getTwo_six_wed(); break;
                case 5 : value = schedule.getTwo_six_thu(); break;
                case 6 : value = schedule.getTwo_six_fri(); break;
            }
        }
        return value;
    }

    private void getTeacherName(String[] timeline) {
        if(gradeSpinner.getSelectedItem().toString().equals("1")) {
            for(int i = 0; i < 7; i++) {
                switch (timeline[i]) {
                    case("역사") : teachers[i] = "박경수T"; break;
                    case("기제") : teachers[i] = "김상현T"; break;
                    case("사회") : teachers[i] = "이민주T"; break;
                    case("체육") : teachers[i] = "김성렬T"; break;
                    case("수2") : teachers[i] = "김세희T"; break;
                    case("국어") : teachers[i] = "김태철T"; break;
                    case("플밍") : teachers[i] = "조혜연T"; break;
                    case("진로") : teachers[i] = "담당T"; break;
                    case("영A") : teachers[i] = "김지혜T"; break;
                    case("정통") : teachers[i] = "김혁준T"; break;
                    case("음악") : teachers[i] = "정다움T"; break;
                    case("영어B") : teachers[i] = "전유원T"; break;
                    case("컴그A") : teachers[i] = "하성봉T"; break;
                    case("컴그B") : teachers[i] = "최보윤T"; break;
                    case("과학") : teachers[i] = "김종수T"; break;
                }
            }
        }

        else {
            for(int i = 0; i < timeline.length; i++) {
                switch (timeline[i]) {
                    case("광고") : teachers[i] = "정희범T"; break;
                    case("중국어") : teachers[i] = "정지훈T"; break;
                    case("체육") : teachers[i] = "이재민T"; break;
                    case("공수A") : teachers[i] = "김세희T"; break;
                    case("문학") : teachers[i] = "허관무T"; break;
                    case("자바") : teachers[i] = "이호선T"; break;
                    case("진로") : teachers[i] = "담당T"; break;
                    case("영A") : teachers[i] = "전유원T"; break;
                    case("회계") : teachers[i] = "엄진영T"; break;
                    case("음악") : teachers[i] = "정다움T"; break;
                    case("영B") : teachers[i] = "양재덕T"; break;
                    case("3D") : teachers[i] = "안수진T"; break;
                    case("디자인") : teachers[i] = "하성봉T"; break;
                    case("공업") : teachers[i] = "하미영T"; break;
                    case("물리") : teachers[i] = "김상욱T"; break;
                    case("화학") : teachers[i] = "김종수T"; break;
                }
            }
        }

    }
}
