package com.erickcasav.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.erickcasav.petagram.adapter.MascotaAdaptador;
import com.erickcasav.petagram.pojo.Mascota;

import java.util.ArrayList;

public class ActivityFavoritos extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotaFavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try
        {
            setContentView(R.layout.activity_favoritos);

            //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
            setSupportActionBar(miActionBar);

            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            rvMascotaFavoritos = (RecyclerView) findViewById(R.id.rvMascotaFavoritos);

            LinearLayoutManager llmMascota = new LinearLayoutManager(this);
            llmMascota.setOrientation(LinearLayoutManager.VERTICAL);

            rvMascotaFavoritos.setLayoutManager(llmMascota);

            inicializarListaMscotas();
            inicializarAdaptador();
        }
        catch (Exception e)
        {
            Log.d("Error",e.getMessage().toString());
        }
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
