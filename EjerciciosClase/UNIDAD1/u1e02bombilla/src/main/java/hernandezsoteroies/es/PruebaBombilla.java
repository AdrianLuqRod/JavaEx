package hernandezsoteroies.es;

public class PruebaBombilla {
    public static void main(String arg[]) {

        Bombilla led;

        led = new Bombilla();

        led.imprimeMarca();
        led.imprimePotencia();
        led.cambiaMarca("Phillips");
        led.cambiaPotencia(100);
        led.encender();
        led.apagar();
        led.encender();
        led.imprimeEstado();
        led.imprimeMarca();
        led.imprimePotencia();
    }
}
