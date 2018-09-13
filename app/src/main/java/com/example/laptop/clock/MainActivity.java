package com.example.laptop.clock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AnalogClock analogClock;
    private DigitalClock digitalClock;
    private TextClock textClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        analogClock = findViewById(R.id.analogClockId);
        digitalClock = findViewById(R.id.digitalClockId);
        textClock = findViewById(R.id.textClockId);

        analogClock.setOnClickListener(this);
        digitalClock.setOnClickListener(this);
        textClock.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        if (view == analogClock){


            Toast.makeText(MainActivity.this,"Analog Clock",Toast.LENGTH_SHORT).show();
        }

        if (view == digitalClock){


            Toast.makeText(MainActivity.this,"Digital Clock",Toast.LENGTH_SHORT).show();
        }

        if (view == textClock){


            Toast.makeText(MainActivity.this,"Text Clock",Toast.LENGTH_SHORT).show();
        }






    }
}
