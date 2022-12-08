package com.example.intenciones;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoMascotaActivity extends AppCompatActivity {


    private ImageView imagenMascotasInfo;
    private TextView txtNombreMascotaInfo, txtRazaMascotaInfo, txtEdadMascotaInfo, txtNumeroMascotaInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_mascota);

        imagenMascotasInfo = findViewById(R.id.imagenMascotaInfo);
        txtNombreMascotaInfo = findViewById(R.id.txtNombreMascotaInfo);
        txtRazaMascotaInfo = findViewById(R.id.txtRazaMascotaInfo);
        txtEdadMascotaInfo = findViewById(R.id.txtEdadMascotaInfo);
        txtNumeroMascotaInfo = findViewById(R.id.txtNumeroMascotaInfo);

        imagenMascotasInfo.setImageResource(getIntent().getIntExtra("idImagen",0));
        txtNombreMascotaInfo.setText(getIntent().getStringExtra("nombre"));
        txtRazaMascotaInfo.setText(getIntent().getStringExtra("raza"));
        txtEdadMascotaInfo.setText(getIntent().getStringExtra("edad"));
        txtNumeroMascotaInfo.setText(getIntent().getStringExtra("numero"));
    }
}