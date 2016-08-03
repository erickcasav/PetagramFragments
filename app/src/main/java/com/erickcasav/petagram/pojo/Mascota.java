package com.erickcasav.petagram.pojo;

/**
 * Created by ejcastaneda on 21/07/2016.
 */
public class Mascota {
    private int identificadorMascota;
    private String nombreMascota;
    private String cantidadLikes;
    private int fotoMascota;

    public Mascota(int identificadorMascota, String nombreMascota, String cantidadLikes, int fotoMascota) {
        this.identificadorMascota = identificadorMascota;
        this.nombreMascota = nombreMascota;
        this.cantidadLikes = cantidadLikes;
        this.fotoMascota = fotoMascota;
    }

    public int getIdentificadorMascota() {
        return identificadorMascota;
    }

    public void setIdentificadorMascota(int identificadorMascota) {
        this.identificadorMascota = identificadorMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getCantidadLikes() {
        return cantidadLikes;
    }

    public void setCantidadLikes(String cantidadLikes) {
        this.cantidadLikes = cantidadLikes;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

}
