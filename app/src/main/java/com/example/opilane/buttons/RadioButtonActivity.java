package com.example.opilane.buttons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    RadioButton Arbuus, Pirn, Õun, Kirss, Virsik;
    Button submit, next;
    String valitudPuuvili;
    TextView textView;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        textView = findViewById(R.id.textView4);
        checkBox = findViewById(R.id.checkbox1);
        next = findViewById(R.id.next);
        submit = findViewById(R.id.submit);
        Arbuus = findViewById(R.id.arbuus);
        Pirn = findViewById(R.id.pirn);
        Õun = findViewById(R.id.õun);
        Kirss = findViewById(R.id.kirss);
        Virsik = findViewById(R.id.kirss);

        next.setEnabled(false);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Arbuus.isChecked()){
                    valitudPuuvili = Arbuus.getText().toString();

                }else if (Pirn.isChecked()){
                    valitudPuuvili = Pirn.getText().toString();

                }else if (Õun.isChecked()){
                    valitudPuuvili = Õun.getText().toString();
                }else if (Kirss.isChecked()){
                    valitudPuuvili = Kirss.getText().toString();

                }else if (Virsik.isChecked()){
                    valitudPuuvili = Virsik.getText().toString();
                }

                textView.setText("Sinu poolt valitud puuvili on: " + valitudPuuvili);
                Toast.makeText(getApplicationContext(), valitudPuuvili, Toast.LENGTH_LONG).show();
                //prindi valitud puuvilja väärtus.
                //peale valiku tegemist muudame nupu mitte aktiivseks, et ei saaks rohkem valida.
                submit.setEnabled(false);


            }
        });
        CompoundButton.OnCheckedChangeListener checker = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton checkBox, boolean isChecked) {
                if (checkBox.isChecked()){
                    next.setEnabled(true);
                }else if (next.isEnabled()){
                    next.setEnabled(false);
                }

            }
        };
        checkBox.setOnCheckedChangeListener(checker);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RadioButtonActivity.this,VideoActivity.class);
                startActivity(intent);
            }
        });
    }
}
