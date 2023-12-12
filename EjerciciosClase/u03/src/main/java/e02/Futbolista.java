package e02;

//. package es.carca.futbol.jugadores

public class Futbolista {
    private String nombre, apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;

    public Futbolista(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

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
        assert (numGoles > 0 && !lesionado);
        this.numGoles = numGoles;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        assert !(salario < 0) : "nose que pasa";
        this.salario = salario;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
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
    }
}
