package e06;

import java.util.*;

public class Ciudades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ciudades = new String[10];
        System.out.println("Pon el nombre de las 10 ciudades que mas te gusten: ");
        for (int i = 0; i < ciudades.length; i++) {
            System.out.printf((i + 1) + ":");
            ciudades[i] = sc.nextLine();
        }
        Arrays.sort(ciudades);

        System.out.println(Arrays.toString(ciudades));
        sc.close();
    }
}
