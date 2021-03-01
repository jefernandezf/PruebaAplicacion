package com.baufest.ingreso.model;

public class Jugador  implements Comparable<Jugador>{

    private String nombre;
    private Integer puntuacion;

    public Jugador(String nombre, Integer puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
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
