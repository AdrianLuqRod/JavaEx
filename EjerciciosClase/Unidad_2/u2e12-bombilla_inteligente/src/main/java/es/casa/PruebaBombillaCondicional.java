package es.casa;

public class PruebaBombillaCondicional {
    public static void main(String[] args) {
        BombillaInteligente b = new BombillaInteligente();
        b.cambiaMarca("Phillips");
        b.cambiaPotencia(100);
        b.encender();
        b.apagar();
        b.apagar();
        b.encender();
        b.encender();
        b.apagar();
        b.imprimeEstado();
    }
}