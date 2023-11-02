/**
 ** Escribe el código que falta para que se realicen las siguientes comprobaciones:
 ** Si la edad >= 18 se debería imprimir "Ya eres un señor/a "
 ** Si la altura >= 185 se debe imprimir "Eres alto/a"
 ** Si estaCasado == false entonces se debe imprimir: "No está casado". 
*/
package es.casa;

import java.util.Scanner;

public class PruebaPersonaCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaCondicional p = new PersonaCondicional();
        System.out.printf("Introduce edad: ");
        int edad = sc.nextInt();
        System.out.printf("Introduce altura: ");
        int altura = sc.nextInt();
        p.setEstaCasado(false);
        if (edad >= 18) {

            System.out.println("Ya eres un señor");

        } else if (altura >= 185) {

            System.out.println("Eres alto/a");

        } else if (p.isEstaCasado() == false) {

            System.out.println("No está casado.");

        }
        sc.close();
    }
}