package com.example.registro1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button registro;
    Button inicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registro=(Button)findViewById(R.id.REGISTRO);
        inicio=(Button)findViewById(R.id.inicio);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i =new Intent(MainActivity.this ,registro2.class );
            }
        });
    }
}