package com.example.intenciones;

import static com.example.intenciones.R.layout.activity_bienvenida;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class Bienvenida extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuitem,menu);
        return super.onCreateOptionsMenu(menu);
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {




        int id = item.getItemId();
        if(id == R.id.opcion1){
            Intent i = new Intent(this,MainActivity2.class);
            startActivity(i);
        }
        else{
            if(id == R.id.opcion2){
                Toast.makeText(this,"mensaje 2",Toast.LENGTH_LONG).show();
            }
            else{
                if(id == R.id.opcion3){
                    Toast.makeText(this,"mensaje 3",Toast.LENGTH_LONG).show();
                }
            }
        }
        return super.onOptionsItemSelected(item);
    }



}