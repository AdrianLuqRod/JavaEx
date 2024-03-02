package e06;

public class PruebaApartamento {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws DatosApartamentoInvalidoException {

        try {
            Apartamento a = new Apartamento(null, 1, 1, true);
        } catch (DatosApartamentoInvalidoException e) {
            System.out.println("Apartamento con datos inválidos (null)");
        }

        try {
            Apartamento a = new Apartamento("Calle trece", 1000, 1, true);
        } catch (DatosApartamentoInvalidoException e) {
            System.out.println("Apartamento con datos inválidos (1000 habitaciones)");
        }

        try {
            Apartamento a = new Apartamento("Calle trece", 1, 1000, true);
        } catch (DatosApartamentoInvalidoException e) {
            System.out.println("Apartamento con datos inválidos (1000 camas)");
        }
    }

}
