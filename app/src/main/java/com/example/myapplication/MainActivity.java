package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<button> extends AppCompatActivity {

    Button b ;
    EditText e ;
    TextView t ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b = (Button) findViewById(R.id.button);
        e = (EditText) findViewById(R.id.name);
        t = (TextView) findViewById(R.id.ms);

      b.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View v) {

              String str= e.getText().toString();
              t.setText("Hello "+str);

          }
      })  ;


        }
    }
