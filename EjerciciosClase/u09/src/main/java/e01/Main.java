package e01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "numeros.txt";
        boolean anexar;
        final int MAX = 1000;

        System.out.println(
                "En el caso de que el fichero exista, introduce true para añadir al final o false en caso contrario:");
        anexar = sc.nextBoolean();

        try (FileWriter fw = new FileWriter(nombre, anexar);
                BufferedWriter bw = new BufferedWriter(fw)) {
            for (int i = 1; i <= MAX; i++) {
                bw.write(i + "\n");
                if (i % 100 == 0) {
                    bw.flush();
                }
            }
        } catch (IOException ex) {
            System.out.println("Se produjo un abrir o escribir en el fichero " + nombre);
        }
    }
}
