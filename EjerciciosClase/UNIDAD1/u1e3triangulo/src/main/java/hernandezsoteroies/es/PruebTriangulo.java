package hernandezsoteroies.es;

public class PruebTriangulo {
    public static void main(String arg[]) {
        Triangulo trian;
        trian = new Triangulo();
        trian.cambiaLado1(23.32);
        trian.cambiaLado2(12.21);
        trian.cambiaLado3(44.34);
        trian.imprimePerimetro();
        trian.imprimeDescripcion();
    }

}
