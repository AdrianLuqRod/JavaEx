package e38;

import java.util.Random;

public class ArrayDado {
    public static void main(String[] args) {
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
        Random r = new Random();
        final int NUM_TIRADAS = 50000;
        int[] numeros = new int[NUM_TIRADAS];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(6) + 1;
        }
        // ! No se si esto se puede hacer mejor. PREGUNTAR
        // ! No se si esto se puede hacer mejor. PREGUNTAR
        // ! No se si esto se puede hacer mejor. PREGUNTAR
        // ! No se si esto se puede hacer mejor. PREGUNTAR
        // ! No se si esto se puede hacer mejor. PREGUNTAR
        // ! No se si esto se puede hacer mejor. PREGUNTAR
        // ! No se si esto se puede hacer mejor. PREGUNTAR
        for (int j : numeros) {
            if (j == 1) {
                cont1++;
            }

            else if (j == 2) {
                cont2++;
            }

            else if (j == 3) {
                cont3++;
            }

            else if (j == 4) {
                cont4++;
            }

            else if (j == 5) {
                cont5++;
            }

            else {
                cont6++;
            }

        }
        System.out.println("EL numero 1 ha aparecido: " + cont1 + " veces");
        System.out.println("EL numero 2 ha aparecido: " + cont2 + " veces");
        System.out.println("EL numero 3 ha aparecido: " + cont3 + " veces");
        System.out.println("EL numero 4 ha aparecido: " + cont4 + " veces");
        System.out.println("EL numero 5 ha aparecido: " + cont5 + " veces");
        System.out.println("EL numero 6 ha aparecido: " + cont6 + " veces");
    }
}
