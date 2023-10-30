package es.casa;

public class PruebaBombillaCondicional2 {
    public static void main(String[] args) {
        BombillaInteligente2 b = new BombillaInteligente2();
        b.apagar();
        b.apagar();
        b.apagar();
        b.encender();
        b.encender();
        b.encender();
        b.encender();
        b.encender();
        b.encender();
        b.encender();
        b.apagar();
        b.encender();
        b.encender();
        b.encender();
        b.encender();
        b.encender();
        b.apagar();
        b.encender();
        b.obtieneNumVecesEncendida();
        b.imprimeEstado();
    }
}