package e03;

import java.util.Scanner;

import e01.NombreDuplicadoException;

public class PruebaNombresUnicos {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NombresUnicos n = new NombresUnicos();
        String nombre = "";
        do {
            try {
                System.out.println("Introduce el nombre de la persona que quieres agregar:");
                nombre = sc.nextLine();
                n.agregaNombre(nombre);
            } catch (NombreDuplicadoException e) {
                System.out.println("No puedes añadir un nombre duplicado");
            }
        } while (!nombre.equalsIgnoreCase("Fin"));

    }
}
