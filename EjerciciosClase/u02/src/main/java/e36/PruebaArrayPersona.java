package e36;

public class PruebaArrayPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona[] person = { p1, p2, p3, p4 };
        p1.setEdad(43);
        p2.setEdad(40);
        p3.setEdad(24);
        p4.setEdad(14);
        p1.setRol("padre");
        p2.setRol("madre");
        p3.setRol("hijo");
        p4.setRol("hija");

        for (int i = 0; i < person.length; i++) {
            System.out.println("La posición " + (i + 1) + " la ocupa el/la " + person[i].getRol() + " con "
                    + person[i].getEdad() + " años");
        }

        // !!!!!!!!!!!!!!!!! PREGUNTAR A MARIO.
        // !!!!!!!!!!!!!!!!! PREGUNTAR A MARIO.
        // !!!!!!!!!!!!!!!!! PREGUNTAR A MARIO.
        // !!!!!!!!!!!!!!!!! PREGUNTAR A MARIO.
        // !!!!!!!!!!!!!!!!! PREGUNTAR A MARIO.

        // - El hijo 'se va'
        person[2] = null;
        // - 'Llega' el abuelo
        p3.setEdad(80);
        p3.setRol("Abuelo");
        person[2] = p3;
    }
}
