package exE02;

public class CajaCarton implements Almacenable {
    private double anchura, altura, profundidad;

    public CajaCarton(double anchura, double altura, double profundidad) {
        this.anchura = anchura;
        this.altura = altura;
        this.profundidad = profundidad;
    }

    public double calculaVolumen() {
        return anchura * profundidad;
    }

    public double getAltura() {
        return altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void almacena(int numEstanteria) {

    }
}
