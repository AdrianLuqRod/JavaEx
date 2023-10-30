package es.casa;

public class Main {
    public static void main(String[] args) {
        Traduccion t1 = new Traduccion();
        Traduccion t2 = new Traduccion();
        Traduccion t3 = new Traduccion();
        Traduccion t4 = new Traduccion();
        Traduccion t5 = new Traduccion();
        Traduccion[] translations = { t1, t2, t3, t4, t5 };
        t1.setEnglish("To break down");
        t2.setEnglish("To fix");
        t3.setEnglish("To reboot");
        t4.setEnglish("To work");
        t5.setEnglish("To type");
        t1.setSpanish("Averiar");
        t2.setSpanish("Arreglar");
        t3.setSpanish("Reiniciar");
        t4.setSpanish("Funcionar");
        t5.setSpanish("Teclear");
        for (Traduccion elemTraduccion : translations) {
            System.out
                    .println(elemTraduccion.getEnglish() + " en español se traduce por " + elemTraduccion.getSpanish());
        }
    }
}