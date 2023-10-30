package es.casa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[500];
        for (int i = 0; i < numeros.length; i++) {
            Random r = new Random();
            numeros[i] = r.nextInt(1001);
        }
        for (int j : numeros) {
            int modJ = j % 2;
            if (modJ == 0 && j >= 800) {
                System.out.println(j);
            }
        }
    }
}