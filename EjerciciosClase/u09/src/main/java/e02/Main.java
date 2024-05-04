package e02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "numeros.txt";

        try (FileReader fr = new FileReader(nombre);
                BufferedReader br = new BufferedReader(fr)) {
            while (br.ready()) {
                String cadena = br.readLine();
                int numeroPorDos = (Integer.parseInt(cadena) * 2);
                System.out.println(numeroPorDos);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero " + nombre + " no se encuentra");
        } catch (IOException ex) {
            System.out.println("Se produjo un error al leer del fichero " + nombre);
        }
    }
}
