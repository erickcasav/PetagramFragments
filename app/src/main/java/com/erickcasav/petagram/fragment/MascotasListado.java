package com.erickcasav.petagram.fragment;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.erickcasav.petagram.pojo.Mascota;
import com.erickcasav.petagram.adapter.MascotaAdaptador;
import com.erickcasav.petagram.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MascotasListado extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    public MascotasListado() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mascotas_listado, container, false);

        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotaLista);

        LinearLayoutManager llmMascota = new LinearLayoutManager(getActivity());
        llmMascota.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llmMascota);

        inicializarListaMscotas();
        inicializarAdaptador();

        FloatingActionButton fabCamera = (FloatingActionButton)v.findViewById(R.id.fabCamera);
        fabCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Foto", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

    private void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador (mascotas, getActivity());
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
