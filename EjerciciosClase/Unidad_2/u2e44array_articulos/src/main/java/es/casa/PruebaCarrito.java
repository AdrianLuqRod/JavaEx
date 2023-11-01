package es.casa;

import java.util.Scanner;

public class PruebaCarrito {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("TEST CarritoCompra" +
                "\n-------------------\n" +
                "1-Probar método 'guardarArticulo'\n" +
                "2-Probar método 'mostrar articulo'\n" +
                "3-Probar método 'buscarArticuloPorId'\n" +
                "4-Probar método 'calcularPrecioTotalCarrito'" +
                "5-SALIR");
        do {
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                default:
                    System.out.println("Opción incorrecta, prueba de nuevo.");
                    break;
            }
        } while (op < 1 || op > 5);
        sc.close();
    }
}
