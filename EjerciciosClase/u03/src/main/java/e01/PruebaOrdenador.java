package e01;

public class PruebaOrdenador {
    public static void main(String[] args) {
        Ordenador o1 = new Ordenador();
        Ordenador o2 = new Ordenador("marca1", "modelo1");
        Ordenador o3 = new Ordenador("marca2", "modelo2", 2000);
        o1.imprimeEstado();
        o2.imprimeEstado();
        o3.imprimeEstado();
    }
}
