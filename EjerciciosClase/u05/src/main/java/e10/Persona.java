package e10;

public class Persona implements Comparable {
    private String nombre, dni;
    private int edad;

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
    }

    @Override
    public int compareTo(Object obj) {
        Persona p = (Persona) obj;
        int resul = this.edad - p.getEdad();
        if (resul == 0) {
            resul = nombre.compareTo(p.getNombre());
        }
        return resul;

    }
}