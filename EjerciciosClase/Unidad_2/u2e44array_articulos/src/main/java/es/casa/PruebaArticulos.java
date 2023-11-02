package es.casa;

import java.util.Scanner;

public class PruebaArticulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cond = false;
        // !PREGUNTAR MARIO.
        Articulo obj1 = new Articulo();
        Articulo obj2 = new Articulo();
        Articulo obj3 = new Articulo();
        Articulo obj4 = new Articulo();
        Articulo obj5 = new Articulo();
        Articulo[] obj = { obj1, obj2, obj3, obj4, obj5 };
        obj[0].setNombre("Pen");
        obj[1].setNombre("Mouse");
        obj[2].setNombre("Screen");
        obj[3].setNombre("Bottle");
        obj[4].setNombre("Fan");
        obj[0].setIdArticulo(213);
        obj[1].setIdArticulo(12);
        obj[2].setIdArticulo(432);
        obj[3].setIdArticulo(900);
        obj[4].setIdArticulo(525);
        obj[0].setPrecio(0.75);
        obj[1].setPrecio(15.25);
        obj[2].setPrecio(399.99);
        obj[3].setPrecio(1.75);
        obj[4].setPrecio(49.99);
        System.out.printf("Write an item ID: ");
        int numId = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getIdArticulo() == numId) {
                System.out.println("ID articulo: " + obj[i].getIdArticulo() + " // Nombre articulo: "
                        + obj[i].getNombre() + " // Precio articulo: " + obj[i].getPrecio() + "€");
                cond = true;
            }
        }
        if (!cond) {
            System.out.println("Articulo no encontrado");
        }

        for (int j = 0; j < obj.length; j++) {
            System.out.println("Posicion " + (j + 1) + ": idArticulo = " + obj[j].getIdArticulo() + ", nombre = "
                    + obj[j].getNombre() + ", precio = " + obj[j].getPrecio() + "€");
        }
        sc.close();
    }
}