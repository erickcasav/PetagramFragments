package com.erickcasav.petagram.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.erickcasav.petagram.pojo.Mascota;
import com.erickcasav.petagram.R;

import java.util.ArrayList;

/**
 * Created by ejcastaneda on 23/07/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;ViewGroup parent;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        this.parent = parent;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFotoCV.setImageResource(mascota.getFotoMascota());
        mascotaViewHolder.tvNombreMascota.setText(mascota.getNombreMascota());
        mascotaViewHolder.tvCantidadLike.setText(mascota.getCantidadLikes());

        if ((position % 2) == 0) {
            mascotaViewHolder.llImagen.setBackgroundColor(parent.getResources().getColor(R.color.colorAccent));
        }
        else{
            mascotaViewHolder.llImagen.setBackgroundColor(parent.getResources().getColor(R.color.colorPrimary));
        }

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "Diste Like a " + mascota.getNombreMascota(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgFotoCV;
        public TextView tvNombreMascota;
        public  TextView tvCantidadLike;
        public ImageButton btnLike;
        public LinearLayout llImagen;

        public MascotaViewHolder(View itemView) {
            super(itemView);

            imgFotoCV = (ImageView) itemView.findViewById(R.id.imgFotoCV);
            tvCantidadLike = (TextView) itemView.findViewById(R.id.tvCantidadLike);
            tvNombreMascota = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnLike);
            llImagen = (LinearLayout) itemView.findViewById(R.id.llImagen);


        }
    }
}


