package hernandezsoteroies.es;

public class Triangulo {
    public double tamLado1;
    public double tamLado2;
    public double tamLado3;
    public double perimetro;

    public void cambiaLado1(double nuevoTamanio) {
        tamLado1 = nuevoTamanio;
    }

    public void cambiaLado2(double nuevoTamanio) {
        tamLado2 = nuevoTamanio;
    }

    public void cambiaLado3(double nuevoTamanio) {
        tamLado3 = nuevoTamanio;
    }

    public void imprimePerimetro() {
        perimetro = tamLado1 + tamLado2 + tamLado3;
        System.out.println("El perimetro es: " + perimetro);
    }

    public void imprimeDescripcion() {
        System.out.println("Lado1: " + tamLado1 + "Lado2: " + tamLado2 + "Lado3: " + tamLado3);
    }
}
