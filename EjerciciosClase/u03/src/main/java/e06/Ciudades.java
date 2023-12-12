package e06;

import java.util.*;

public class Ciudades {
    public static void main(String[] args) {
<<<<<<< HEAD
        String[] ciudades = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el nombre de las 10 ciudades que mas te gusten: ");
        for (int i = 0; i < ciudades.length; i++) {
            ciudades[i] = sc.nextLine();
            if (i == ciudades.length - 1) {
                break;
            }
            System.out.printf("Introduce la siguiente: ");
        }
        Arrays.sort(ciudades);
=======
        Scanner sc = new Scanner(System.in);
        String[] ciudades = new String[10];
        System.out.println("Pon el nombre de las 10 ciudades que mas te gusten: ");
        for (int i = 0; i < ciudades.length; i++) {
            System.out.printf((i + 1) + ":");
            ciudades[i] = sc.nextLine();
        }
        Arrays.sort(ciudades);

>>>>>>> d1dfcd335665d24d5e0621a6325bcb4e8f018d60
        System.out.println(Arrays.toString(ciudades));
        sc.close();
    }
}
