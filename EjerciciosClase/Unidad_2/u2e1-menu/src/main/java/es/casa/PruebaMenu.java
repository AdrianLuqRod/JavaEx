package es.casa;

public class PruebaMenu {
    public static void main(String[] args) {
        Menu m1 = new Menu();
        m1.setPrimerPlato("Ensalada de la casa");
        m1.setSegundoPlato("Solomillo al whisky");
        m1.setPrecio(11.95);
        m1.setCalorias(798);
        m1.imprimeMenu();
    }
}