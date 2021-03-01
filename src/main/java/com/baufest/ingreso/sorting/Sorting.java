package com.baufest.ingreso.sorting;

import com.baufest.ingreso.model.Jugador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {


    public static void main(String[] args) {

        try {

            Jugador jugador = new Jugador("Junior", 12);
            Jugador jugador1 = new Jugador("Carlos", 8);
            Jugador jugador2 = new Jugador("Luis", 2);
            Jugador jugador3 = new Jugador("Pedro", 54);
            List lista = new ArrayList();

            lista.add(jugador);
            lista.add(jugador1);
            lista.add(jugador2);
            lista.add(jugador3);


            ordenarPorPuntuacionYNombre(lista);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void ordenarPorPuntuacionYNombre(List lista) {
        lista.sort(Comparator.comparingDouble(Jugador::getPuntuacion)
                .reversed());
        lista.forEach(System.out::println);
        System.out.println("====================================================");
        Collections.sort(lista);

        lista.forEach(x -> System.out.println("\t" + x.toString()));
        System.out.println("");


    }

    private static void printList(String title, List list) {
        System.out.println(title);
        list.forEach(x -> System.out.println("\t" + x.toString()));
        System.out.println("");
    }


}
