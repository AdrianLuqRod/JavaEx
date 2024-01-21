package e01;

public class PruebaVehiculo {
    public PruebaVehiculo() {
    }

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.setNumRuedas(4);
        v1.setPotencia(100.0);
        v1.setConsumoPor100Km(6.0);
        v1.reponerCombustible(100.0);
        v1.arrancar();
        v1.recorrerDistancia(20.0);
        v1.apagar();
        v1.imprimeAutonomiaEnKm();
        System.out.println("-------------");
        v1.arrancar();
        v1.recorrerDistancia(100000.0);
        System.out.println("Num ruedas = " + v1.getNumRuedas());
        System.out.println("Consumo 100 = " + v1.getConsumoPor100Km());
        v1.imprimeAutonomiaEnKm();
        v1.imprimeNumRuedas();
        v1.imprimePotencia();
        v1.imprimeLitrosEnDeposito();
        System.out.println("Porcentaje de desgaste = " + v1.calculaPorcentajeDesgaste());
    }
}
