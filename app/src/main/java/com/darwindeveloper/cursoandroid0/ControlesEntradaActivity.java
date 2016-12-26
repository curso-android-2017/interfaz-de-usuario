package com.darwindeveloper.cursoandroid0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ControlesEntradaActivity extends AppCompatActivity implements View.OnClickListener {

    Button button2, button3;
    ImageButton imageButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controles_entrada);


        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        imageButton = (ImageButton) findViewById(R.id.imageButton);

        textView = (TextView) findViewById(R.id.textView_text);

        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        imageButton.setOnClickListener(this);


        EditText editText_email=(EditText)findViewById(R.id.editText_textEmailAddress);
        editText_email.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                String email=textView.getText().toString();

                Toast.makeText(ControlesEntradaActivity.this, "email "+email, Toast.LENGTH_SHORT).show();
                return true;
            }
        });


        AutoCompleteTextView autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);

        String[] array={"ecuador","chile","china"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(ControlesEntradaActivity.this, android.R.layout.simple_list_item_1, array);
        autoCompleteTextView.setAdapter(adapter);



    }


    /**
     * Called when the user touches the button
     */
    public void sendMessage(View view) {
        // Do something in response to button click
        Toast.makeText(ControlesEntradaActivity.this, "Click", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id) {
            case R.id.button2:

                EditText editText = (EditText) findViewById(R.id.editText_textPersonName);


                textView.setText(editText.getText());
                textView.setText(editText.getText());

                EditText editTextdecimal = (EditText) findViewById(R.id.editText_numberDecimal);
                Float numero=Float.parseFloat(editTextdecimal.getText().toString());
                Toast.makeText(this, "decimal "+numero, Toast.LENGTH_SHORT).show();






                break;

            case R.id.button3:
                Toast.makeText(ControlesEntradaActivity.this, "3 onClick", Toast.LENGTH_SHORT).show();
                break;


            case R.id.imageButton:
                Toast.makeText(ControlesEntradaActivity.this, "Gracias", Toast.LENGTH_SHORT).show();
                finishAffinity();
                break;

        }

    }
}
