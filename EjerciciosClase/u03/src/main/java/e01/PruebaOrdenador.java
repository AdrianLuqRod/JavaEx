package e01;

public class PruebaOrdenador {
    public static void main(String[] args) {
        ordenador o1 = new ordenador();
        ordenador o2 = new ordenador("marca2", "modelo2");
        ordenador o3 = new ordenador("marca3", "modelo3", 1932);
        System.out.println();
        o1.imprimeEstado();
        System.out.println();
        o2.imprimeEstado();
        System.out.println();
        o3.imprimeEstado();
    }
}
