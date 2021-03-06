package com.example.gauge;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import in.unicodelabs.kdgaugeview.KdGaugeView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    KdGaugeView speedoMeterView;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        speedoMeterView = (KdGaugeView)findViewById(R.id.speedMeter);
        editText =(EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int speed = Integer.parseInt(editText.getText().toString());
                speedoMeterView.setSpeed(speed);
            }
        });

    }
}