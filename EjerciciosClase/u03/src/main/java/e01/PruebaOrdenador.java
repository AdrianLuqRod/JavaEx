package e01;

public class PruebaOrdenador {
    public static void main(String[] args) {
<<<<<<< HEAD
        Ordenador o1 = new Ordenador();
        Ordenador o2 = new Ordenador("marca1", "modelo1");
        Ordenador o3 = new Ordenador("marca2", "modelo2", 2000);
        o1.imprimeEstado();
        o2.imprimeEstado();
=======
        ordenador o1 = new ordenador();
        ordenador o2 = new ordenador("marca2", "modelo2");
        ordenador o3 = new ordenador("marca3", "modelo3", 1932);
        System.out.println();
        o1.imprimeEstado();
        System.out.println();
        o2.imprimeEstado();
        System.out.println();
>>>>>>> d1dfcd335665d24d5e0621a6325bcb4e8f018d60
        o3.imprimeEstado();
    }
}
