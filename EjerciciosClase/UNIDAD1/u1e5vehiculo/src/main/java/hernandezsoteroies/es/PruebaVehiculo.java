package hernandezsoteroies.es;

public class PruebaVehiculo {
    public static void main(String arg[]) {
        Vehiculo rx7;
        rx7 = new Vehiculo();
        rx7.setNumRuedas(4);
        rx7.setPotencia(250);
        rx7.setConsumoPorKm(0.11);
        rx7.reponerCombustible(76);
        rx7.arrancar();
        rx7.apagar();
        rx7.recorrerDistancia(80);
        rx7.imprimeAutonomiaEnKm();
        rx7.imprimeLitrosEnDeposito();
        rx7.imprimeNumRuedas();
        rx7.imprimePotencia();
    }
}
