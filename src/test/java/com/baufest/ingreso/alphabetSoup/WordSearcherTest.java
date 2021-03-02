package com.baufest.ingreso.alphabetSoup;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class WordSearcherTest {

    @Test
    public void contieneUnaMatrixDeLetras() {
        WordSearcher sopaDeLetras = new WordSearcher();
        char[][] matrizEsperada = {{'a', 'b', 'c', 'd', 'e', 'a'},
                {'g', 'h', 'i', 'j', 'r', 'l'},
                {'u', 'm', 'n', 'r', 'p', 'q'},
                {'a', 's', 'e', 'u', 'v', 'w'},
                {'x', 'i', 'z', 'a', 'b', 'c'},
                {'t', 'f', 'u', 'e', 'g', 'o'}};
        assertArrayEquals(matrizEsperada, sopaDeLetras.getMatriz());
    }

    @Test
    public void puedeAgregarUnaNuevaMatrixDeLetras() {
        WordSearcher sopaDeLetras = new WordSearcher();
        char[][] nuevaMatriz = {{'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}};
        sopaDeLetras.setMatriz(nuevaMatriz);
        assertArrayEquals(nuevaMatriz, sopaDeLetras.getMatriz());
    }

    @Test
    public void retornaIndiceInvertidoDeLaPalabraAgua() {
        WordSearcher sopaDeLetras = new WordSearcher();
        assertArrayEquals(new int[][]{{0, 0}, {0, 5}, {3, 0}, {4, 3}}, sopaDeLetras.posiblesSolucionesDe("agua"));
    }

    @Test
    public void retornaIndiceInvertidoDeLaPalabraTierra() {
        WordSearcher sopaDeLetras = new WordSearcher();
        assertArrayEquals(new int[][]{{5, 0}}, sopaDeLetras.posiblesSolucionesDe("tierra"));
    }

    @Test
    public void retornaAguaUsandoOrientacionVertical() {
        WordSearcher sopaDeLetras = new WordSearcher();
        assertEquals("agua", sopaDeLetras.palabraEnMatriz(new int[]{0, 0}, "agua".length(), 1, 0));
    }

    @Test
    public void retornaABCUsandoOrientacionHorizontal() {
        WordSearcher sopaDeLetras = new WordSearcher();
        assertEquals("abc", sopaDeLetras.palabraEnMatriz(new int[]{0, 0}, "abc".length(), 0, 1));
    }

    @Test
    public void retornaAXTConOrientacionVerticalLongitudCuatro() {
        WordSearcher sopaDeLetras = new WordSearcher();
        assertEquals("axt", sopaDeLetras.palabraEnMatriz(new int[]{3, 0}, 4, 1, 0));
    }

    @Test
    public void retornaEGOConOrientacionHorizontalLongitudCuatro() {
        WordSearcher sopaDeLetras = new WordSearcher();
        assertEquals("ego", sopaDeLetras.palabraEnMatriz(new int[]{5, 3}, 4, 0, 1));
    }

    @Test
    public void retornaCBAConOrientacionHorizontalReversa() {
        WordSearcher sopaDeLetras = new WordSearcher();
        assertEquals("cba", sopaDeLetras.palabraEnMatriz(new int[]{0, 2}, 3, 0, -1));
    }


    @Test
    public void retornaBAConOrientacionHorizontalIzquiedaLongitudTres() {
        WordSearcher sopaDeLetras = new WordSearcher();
        assertEquals("ba", sopaDeLetras.palabraEnMatriz(new int[]{0, 1}, 3, 0, -1));
    }

    @Test
    public void retornaGAConOrientacionVerticalArribaLongitudTres() {
        WordSearcher sopaDeLetras = new WordSearcher();
        assertEquals("ga", sopaDeLetras.palabraEnMatriz(new int[]{1, 0}, 3, -1, 0));
    }
}
