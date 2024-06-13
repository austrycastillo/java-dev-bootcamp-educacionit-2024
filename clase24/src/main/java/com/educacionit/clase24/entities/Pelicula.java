package com.educacionit.clase24.entities;

public class Pelicula {
    private String pelicula;
    private  String actor;

    public Pelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    public Pelicula() {

    }
    public Pelicula(String pelicula, String  actor) {
        this.pelicula = pelicula;
        this.actor = actor;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "pelicula='" + pelicula + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }
}
