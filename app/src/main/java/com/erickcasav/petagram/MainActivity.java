package com.erickcasav.petagram;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMascotas = (RecyclerView) findViewById(R.id.rvMascotaLista);

        LinearLayoutManager llmMascota = new LinearLayoutManager(this);
        llmMascota.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llmMascota);

        inicializarListaMscotas();
        inicializarAdaptador();

        FloatingActionButton fabCamera = (FloatingActionButton)findViewById(R.id.fabCamera);
        fabCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Foto", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.mAbout:
                Toast.makeText(this, "Acerca de", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSettings:
                Toast.makeText(this, "Configuración", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mavFavorites:
                Intent intent = new Intent(this, ActivityFavoritos.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador (mascotas, this);
        rvMascotas.setAdapter(adaptador);
    }

    private void inicializarListaMscotas()
    {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(1, "Javi", "5", R.drawable.mascota_1));
        mascotas.add(new Mascota(2, "Rocky", "4", R.drawable.mascota_2));
        mascotas.add(new Mascota(3, "Cuasi", "3", R.drawable.mascota_3));
        mascotas.add(new Mascota(4, "Diablo", "2", R.drawable.mascota_4));
        mascotas.add(new Mascota(5, "Gatonto", "7", R.drawable.mascota_5));
        mascotas.add(new Mascota(6, "Rudo", "9", R.drawable.mascota_6));
        mascotas.add(new Mascota(7, "Cursi", "22", R.drawable.mascota_7));
        mascotas.add(new Mascota(8, "Oso", "1", R.drawable.mascota_8));
        mascotas.add(new Mascota(9, "Princeso", "15", R.drawable.mascota_9));

    }


}
