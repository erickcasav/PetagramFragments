package com.erickcasav.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ActivityFavoritos extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotaFavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        rvMascotaFavoritos = (RecyclerView) findViewById(R.id.rvMascotaFavoritos);

        LinearLayoutManager llmMascota = new LinearLayoutManager(this);
        llmMascota.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotaFavoritos.setLayoutManager(llmMascota);

        inicializarListaMscotas();
        inicializarAdaptador();
    }

    private void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador (mascotas, this);
        rvMascotaFavoritos.setAdapter(adaptador);
    }

    private void inicializarListaMscotas()
    {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(1, "Javi", "5", R.drawable.mascota_1));
        mascotas.add(new Mascota(4, "Diablo", "2", R.drawable.mascota_4));
        mascotas.add(new Mascota(6, "Rudo", "9", R.drawable.mascota_6));
        mascotas.add(new Mascota(7, "Cursi", "22", R.drawable.mascota_7));
        mascotas.add(new Mascota(9, "Princeso", "15", R.drawable.mascota_9));

    }
}
