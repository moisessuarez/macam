package com.example.intenciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    private EditText ete1,ete2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ete1 = findViewById(R.id.et1);
        ete2 = findViewById(R.id.et2);
    }

       public void validar(View view){

        String usuario = ete1.getText().toString();
        String password = ete2.getText().toString();

        if (usuario.equals("admin") && password.equals("12345")){
            Intent i = new Intent(this,Bienvenida.class);
            i.putExtra("Nombre",usuario);
            startActivity(i);
        }else{
            Toast.makeText(this, "Usuario y/o contraseña no válidos", Toast.LENGTH_SHORT).show();

        }

    }
    public void registro(View view){

        Intent i = new Intent(this,Registro.class);
        startActivity(i);
    }

    public void contrasena(View view){

        Intent i = new Intent(this,RecuperarContrasena.class);
        startActivity(i);
    }

}