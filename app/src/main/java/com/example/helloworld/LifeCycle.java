package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LifeCycle extends AppCompatActivity {

    Button btnTrue;
    Button btnFalse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        btnTrue = findViewById(R.id.btnTrue);
        btnFalse = findViewById(R.id.btnFalse);

        if(btnTrue != null) {
            btnTrue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CharSequence text = "Correct!";
                    Toast toast = Toast.makeText(LifeCycle.this, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            });
        }

        if(btnFalse != null) {
            btnFalse.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CharSequence text = "Incorrect!";
                    Toast toast = Toast.makeText(LifeCycle.this, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            });
        }
    }
}