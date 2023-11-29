package e02;

public class PruebaFutbolista {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista("Adrian", "Luque");
        f1.marcaGol(-2);
        f1.marcaGol(0);
        f1.marcaGol(2);
        f1.marcaGol();
        f1.marcaGol();
        f1.marcaGol();
        f1.golAnulado();
        f1.golAnulado();
        f1.golAnulado();
        f1.golAnulado();
        f1.golAnulado(13);
        f1.golAnulado(13);
        f1.setLesionado(true);
        f1.setLesionado(false);
        f1.setLesionado(false);
        f1.setLesionado(true);
        f1.setLesionado(true);
        f1.setLesionado(true);
        f1.setSalario(-13);
        f1.setSalario(0);
        f1.setSalario(3210);
    }
}
