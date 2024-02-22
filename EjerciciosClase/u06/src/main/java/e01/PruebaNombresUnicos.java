package e01;

public class PruebaNombresUnicos {
    public static void main(String[] args) throws Exception {
        NombresUnicos n = new NombresUnicos();
        n.agregaNombre("Juan");
        System.out.println("Juan se agrego correctamente");
        n.agregaNombre("Ana");
        System.out.println("Ana se agrego correctamente");
        n.agregaNombre("juan");
        System.out.println("juan se agrego correctamente");
    }
}
