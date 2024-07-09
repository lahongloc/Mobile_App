package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class create extends AppCompatActivity {

    Button btnCreate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        btnCreate = findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.txtUsername);
                CharSequence text = tv.getText();
                if(text.toString().isEmpty()) {
                    Toast.makeText(create.this, "Vui lòng nhập username!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(create.this, "User " + text.toString() + " đã được tạo!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}