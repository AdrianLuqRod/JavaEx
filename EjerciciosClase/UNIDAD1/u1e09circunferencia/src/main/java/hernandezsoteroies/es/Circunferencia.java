package hernandezsoteroies.es;

public class Circunferencia {
    public double radio;
    public double perimetro;
    public double superficie;

    public void estableceRadio(double nuevoRadio) {
        radio = nuevoRadio;
    }

    public void calculaPerimetro() {
        perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro: " + perimetro);
    }

    public void calculaSuperficie() {
        superficie = Math.PI * Math.pow(radio, 2);
        System.out.println("Superficie: " + superficie);
    }
}
