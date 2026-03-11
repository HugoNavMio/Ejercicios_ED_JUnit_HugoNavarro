package org.example;

import java.util.Random;

public class Act7 {
    public static void main(String[] args) {
        final int LIMIT = 999;
        final int NIA = 10802206;
        Random random = new Random(NIA);
        int aleatorio;
        int sumaAleatorio = 0;
        for (int i = 0; i < LIMIT; i++) {
            aleatorio = random.nextInt();
            sumaAleatorio += aleatorio;
        }
    }
}