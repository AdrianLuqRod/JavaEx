package e02;

//. package es.marca.futbol

//. import es.marca.futbol.jugadores.Futbolista;

public class PruebaFutbolista {
    public static void main(String[] args) {
        Futbolista f = new Futbolista("Adrian", "Luque");
        f.setSalario(-321);
        f.setSalario(3210);
        f.marcaGol();
        f.setLesionado(true);
        f.marcaGol();
        f.marcaGol();
        f.marcaGol(12);
        f.setLesionado(false);
        f.marcaGol(-23);
        f.marcaGol(2);
        f.golAnulado();
        f.golAnulado(2);
    }
}
