package e01;

public class Ordenador {
    private String marca, modelo;
    private int anioFabricacion;
    private boolean encendido;

    public Ordenador() {

    }

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Ordenador(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void imprimeEstado() {
        System.out.println("Marca = " + marca + "// Modelo = " + modelo + " // AnioFabricacion = " + anioFabricacion
                + " // Encendido = " + encendido);

    }
}
