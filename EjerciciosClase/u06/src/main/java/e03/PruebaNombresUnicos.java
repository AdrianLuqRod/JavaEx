package e03;

import e01.NombreDuplicadoException;

public class PruebaNombresUnicos {
    public static void main(String[] args) {
        NombresUnicos n = new NombresUnicos();
        try {
            n.agregaNombre("Juan");
            System.out.println("Juan añadido con exito");
            n.agregaNombre("Ana");
            System.out.println("Ana añadido con exito");
            n.agregaNombre("juan");
        } catch (NombreDuplicadoException e) {
            System.out.println("No puedes añadir un nombre duplicado");
        }
    }
}
