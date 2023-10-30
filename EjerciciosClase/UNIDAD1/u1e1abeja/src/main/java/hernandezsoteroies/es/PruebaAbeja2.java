package hernandezsoteroies.es;

public class PruebaAbeja2 {
    public static void main(String[] args) {
        Abeja lili;
        lili = new Abeja();
        lili.vuela();
        lili.cambiaPosicionX(2);
        lili.sePosa();
        lili.cambiaCargaNectar(1);
        lili.vuela();
        lili.cambiaPosicionY(2);
        lili.sePosa();
        lili.cambiaCargaNectar(2);
        lili.vuela();
        lili.cambiaPosicionX(0);
        lili.sePosa();
        lili.cambiaCargaNectar(3);
        lili.imprimeEstadoVuelo();
        lili.imprimeNumCargasNectar();
        lili.imprimePeso();
        lili.imprimePosicionX();
        lili.imprimePosicionY();
    }
}