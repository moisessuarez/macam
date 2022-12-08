package com.example.intenciones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



import java.util.LinkedList;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        recyclerMascotas = findViewById(R.id.RecyclerMascotas);

        LinkedList<Mascotas> mascotas = new LinkedList<Mascotas>();

        mascotas.add(new Mascotas("Volcano","2 Años","Akita","3004446240",R.drawable.akita));
        mascotas.add(new Mascotas("Nicolay","2 Años","Pinscher","3004446240", R.drawable.nicolay));
        mascotas.add(new Mascotas("Manivela","2 Años","Show Show","3004446240",R.drawable.showshow));
        mascotas.add(new Mascotas("Volcano","2 Años","Akita","3004446240",R.drawable.akita));
        mascotas.add(new Mascotas("Nicolay","2 Años","Pinscher","3004446240", R.drawable.nicolay));
        mascotas.add(new Mascotas("Manivela","2 Años","Show Show","3004446240",R.drawable.showshow));
        mascotas.add(new Mascotas("Volcano","2 Años","Akita","3004446240",R.drawable.akita));
        mascotas.add(new Mascotas("Nicolay","2 Años","Pinscher","3004446240", R.drawable.nicolay));
        mascotas.add(new Mascotas("Manivela","2 Años","Show Show","3004446240",R.drawable.showshow));

        MascotasAdapter adapter = new MascotasAdapter(mascotas);
        recyclerMascotas.setLayoutManager(new LinearLayoutManager(this));
        recyclerMascotas.setAdapter(adapter);



    }


}