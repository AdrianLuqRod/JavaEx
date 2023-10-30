package es.casa;

import java.util.Scanner;

public class PruebaDado {
    public static void main(String[] args) {
        boolean acierto = false;
        Scanner sc = new Scanner(System.in);
        Dado d = new Dado();
        System.out.printf("Pon el número que te gustaría que te saliese: ");
        int adiv = sc.nextInt();
        sc.nextLine();
        do {
            int result = d.tirada();
            System.out.println(result);
            if (result == adiv) {
                acierto = true;
            }
        } while (!acierto);
        sc.close();
        // - Ejercicio 30
        // int cont = 0;
        // while (cont < 3) {
        // int result = d.tirada();
        // System.out.println(result);
        // if (result == 6) {
        // cont++;
        // }
        // }

    }
}