package hernandezsoteroies.es;

public class PruebaCircunferencia {
    public static void main(String arg[]) {
        Circunferencia circu;
        circu = new Circunferencia();
        circu.estableceRadio(3);
        circu.calculaPerimetro();
        circu.calculaSuperficie();
    }
}
