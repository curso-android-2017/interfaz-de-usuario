package com.darwindeveloper.cursoandroid0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class CheckActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox checkBox1, checkBox2;
    RadioGroup radioGroup;

    Switch mswitch;
    ToggleButton mtoggleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);

        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);


        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int idRadioButton) {

                if(idRadioButton==R.id.radioButton1){
                    Toast.makeText(CheckActivity.this, "radio seleccionado es 1", Toast.LENGTH_SHORT).show();
                }

                if(idRadioButton==R.id.radioButton2){
                    Toast.makeText(CheckActivity.this, "radio seleccionado es 2", Toast.LENGTH_SHORT).show();
                }
                if(idRadioButton==R.id.radioButton2){
                    Toast.makeText(CheckActivity.this, "radio seleccionado es 3", Toast.LENGTH_SHORT).show();
                }

            }
        });



        mswitch=(Switch)findViewById(R.id.switch1);
        mtoggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        mswitch.setOnCheckedChangeListener(this);
        mtoggleButton.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

        int id = compoundButton.getId();

        String checkbox = "";
        switch (id) {
            case R.id.checkBox1:
                checkbox = " check 1";
                break;
            case R.id.checkBox2:
                checkbox = " check 2";
                break;

            case R.id.switch1:
                if (isChecked) {
                    Toast.makeText(this, "wifi on", Toast.LENGTH_SHORT).show();
                } else {
                    // The toggle is disabled
                    Toast.makeText(this, "wifi off", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.toggleButton:
                if (isChecked) {
                    Toast.makeText(this, "encendido", Toast.LENGTH_SHORT).show();
                } else {
                    // The toggle is disabled
                    Toast.makeText(this, "apagado", Toast.LENGTH_SHORT).show();
                }
                break;
        }



    }
}
