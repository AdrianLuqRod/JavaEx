package exE02;

public class CajaCarton implements Almacenable {
    public final int TAM = 100;
    private int estanteria[] = new int[TAM];
    private int codigo;
    private double anchura, altura, profundidad;

    public CajaCarton(double anchura, double altura, double profundidad) {
        this.anchura = anchura;
        this.altura = altura;
        this.profundidad = profundidad;
    }

    public int getCodigo() {
        return codigo;
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

        System.out.println("Se ha almacenado la caja con codigo " + codigo + " en la estanteria " + numEstanteria);
    }

    public int localiza() {
        return 1;
    }

    public void retira() {
    }
}
