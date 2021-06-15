package com.madhwendra.elegantnumberbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class MainActivity extends AppCompatActivity {
    ElegantNumberButton elegantNumberButton;
    String outputNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elegantNumberButton = findViewById(R.id.elegantBtn);
        elegantNumberButton.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
               outputNumber = elegantNumberButton.getNumber();
                Toast.makeText(MainActivity.this, outputNumber, Toast.LENGTH_SHORT).show();
            }
        });
    }
}