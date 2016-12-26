package com.darwindeveloper.cursoandroid0;

import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner,spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(SpinnerActivity.this,
                R.array.idiomas_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);


        spinner.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {

        String idioma="idioma";

        if(adapterView.getId()==spinner.getId()){
            idioma="idoma 1";
        }

        if(adapterView.getId()==spinner2.getId()){
            idioma="idoma 2";
        }

        Toast.makeText(SpinnerActivity.this,idioma+"  posicion "+pos, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }








}
