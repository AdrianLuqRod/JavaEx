package hernandezsoteroies.es;

public class Prueba2Bombillas {
    public static void main(String arg[]) {
        BombillaInteligente led;
        BombillaInteligente phillips;
        led = new BombillaInteligente();
        phillips = new BombillaInteligente();
        led.encender();
        led.apagar();
        led.encender();
        led.apagar();
        led.encender();
        led.apagar();
        phillips.encender();
        phillips.apagar();
        led.obtieneNumVecesEncendida();
        phillips.obtieneNumVecesEncendida();
    }
}