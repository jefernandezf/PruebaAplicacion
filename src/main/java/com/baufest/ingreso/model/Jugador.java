package com.baufest.ingreso.model;

public class Jugador  implements Comparable<Jugador>{

    private String nombre;
    private Integer puntuacion;
    private Integer perdidas;

    public Jugador(String nombre, Integer puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public Jugador(String nombre, Integer puntuacion, Integer perdidas) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.perdidas = perdidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }


    public Integer getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(Integer perdidas) {
        this.perdidas = perdidas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }

    @Override
    public int compareTo(Jugador employee1) {
        return this.nombre.compareToIgnoreCase(employee1.nombre);
    }
}
