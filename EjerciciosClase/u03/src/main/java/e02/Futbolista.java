package e02;

<<<<<<< HEAD
//. package es.carca.futbol.jugadores

public class Futbolista {
    private String nombre, apellidos;
=======
public class Futbolista {
    private String nombre;
    private String apellidos;
>>>>>>> d1dfcd335665d24d5e0621a6325bcb4e8f018d60
    private int numGoles;
    private double salario;
    private boolean lesionado;

    public Futbolista(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

<<<<<<< HEAD
=======
    public void marcaGol() {
        if (lesionado) {
            System.out.println("Jugador lesionado, no se puede marcar gol");
        }
        numGoles++;
    }

    public void marcaGol(int numGoles) {
        if (numGoles <= 0) {
            System.out.println("No se pueden marcar goles negativos o 0 goles.");
        } else if (lesionado) {
            System.out.println("Jugador lesionado, no se puede marcar gol");
        } else {
            this.numGoles += numGoles;
        }
    }

    public void golAnulado() {
        if (numGoles <= 0) {
            System.out.println("El numero de goles no puede ser negativo.");
        } else {
            numGoles--;
        }
    }

    public void golAnulado(int numGoles) {
        if (this.numGoles > numGoles && numGoles > 0 && this.numGoles > 0) {
            this.numGoles -= numGoles;
        } else {
            System.out.println("No se puede restar goles.");
        }
    }

>>>>>>> d1dfcd335665d24d5e0621a6325bcb4e8f018d60
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
<<<<<<< HEAD
        assert (numGoles > 0 && !lesionado);
=======
>>>>>>> d1dfcd335665d24d5e0621a6325bcb4e8f018d60
        this.numGoles = numGoles;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
<<<<<<< HEAD
        assert !(salario < 0) : "nose que pasa";
        this.salario = salario;
=======
        if (salario <= 0) {
            System.out.println("El salario no puede ser menor a 0");
        } else {
            this.salario = salario;
        }
>>>>>>> d1dfcd335665d24d5e0621a6325bcb4e8f018d60
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
<<<<<<< HEAD
        this.lesionado = lesionado;
    }

    public void marcaGol() {
        assert (!lesionado);
        numGoles++;
    }

    public void marcaGol(int numGoles) {
        assert (!lesionado && numGoles > 0);
        this.numGoles += numGoles;
    }

    public void golAnulado() {
        assert (!lesionado && numGoles > 0);
        numGoles--;
    }

    public void golAnulado(int numGoles) {
        assert (!lesionado && this.numGoles > numGoles && this.numGoles > 0);
        this.numGoles -= numGoles;
=======
        if (this.lesionado != lesionado) {
            this.lesionado = lesionado;
        } else {
            System.out.println("No se puede hacer eso.");
        }
>>>>>>> d1dfcd335665d24d5e0621a6325bcb4e8f018d60
    }
}
