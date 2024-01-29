package exE02;

import java.util.Scanner;

public class PruebaAlmacenable {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Elige una opción: ");
        do {
            System.out.println("\n0- Salir\n1-Almacena");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion != 0 && opcion != 1) {
                System.out.printf("Opcion incorrecta, elige de nuevo: ");
            }
        } while (opcion != 0 && opcion != 1);

    }
}
