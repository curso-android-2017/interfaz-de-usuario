package com.darwindeveloper.cursoandroid0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class TimeAndDateActivity extends AppCompatActivity implements TimePicker.OnTimeChangedListener , DatePicker.OnDateChangedListener {

    TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_and_date);

        TimePicker timePicker=(TimePicker)findViewById(R.id.timePicker);
        time=(TextView)findViewById(R.id.textView_time);
        //timePicker.setEnabled(false);

        Toast.makeText(TimeAndDateActivity.this, "la hora es "+timePicker.getCurrentHour()+" : "+timePicker.getCurrentMinute(), Toast.LENGTH_SHORT).show();

        timePicker.setOnTimeChangedListener(this);

        DatePicker datePicker=(DatePicker)findViewById(R.id.datePicker);

        //Toast.makeText(TimeAndDateActivity.this, "la fecha es "+datePicker.getDayOfMonth()+"/"+datePicker.getMonth()+"/"+datePicker.getYear(), Toast.LENGTH_SHORT).show();


        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH); // Note: zero based!
        int day = now.get(Calendar.DAY_OF_MONTH);

        datePicker.init(year,month,day,this);






    }



    @Override
    public void onTimeChanged(TimePicker timePicker, int hora, int min) {
        int id=timePicker.getId();
        switch (id){
            case R.id.timePicker:
                time.setText(hora+" : "+min);
                break;
        }
    }

    @Override
    public void onDateChanged(DatePicker datePicker, int year, int month, int daymonth) {
        Toast.makeText(TimeAndDateActivity.this, year+"/"+(month+1)+"/"+daymonth, Toast.LENGTH_SHORT).show();
    }
}
