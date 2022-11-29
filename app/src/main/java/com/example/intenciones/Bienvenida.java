package com.example.intenciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Bienvenida extends AppCompatActivity {


    private TextView tv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);


        tv11 = findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        String Nombre = bundle.getString("Nombre");

        tv11.setText("Bienvenido " + Nombre);


    }



    public void salir(View view){

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        }

}