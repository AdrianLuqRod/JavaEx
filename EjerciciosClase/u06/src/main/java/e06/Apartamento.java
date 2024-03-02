package e06;

public class Apartamento {
    private String direccionPostal;
    private int numHabitaciones, numCamas;
    private boolean ocupado;

    public Apartamento(String direccionPostal, int numHabitaciones, int numCamas, boolean ocupado)
            throws DatosApartamentoInvalidoException {
        if (direccionPostal == null || numCamas <= 0 || numCamas >= 50 || numHabitaciones <= 0
                || numHabitaciones >= 50) {
            throw new DatosApartamentoInvalidoException();
        }
        this.direccionPostal = direccionPostal;
        this.numHabitaciones = numHabitaciones;
        this.numCamas = numCamas;
        this.ocupado = ocupado;
    }

    public void ocupar() {
        if (ocupado) {
            System.out.println("Error, ya estaba ocupado.");
        }
        ocupado = true;
    }

    public void liberar() {
        if (!ocupado) {
            System.out.println("Error, ya estaba libre.");
        }
        ocupado = false;
    }
}
