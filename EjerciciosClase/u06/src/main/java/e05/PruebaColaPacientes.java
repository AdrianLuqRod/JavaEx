package e05;

public class PruebaColaPacientes {
    public static void main(String[] args) throws Exception {
        ColaPacientes cp = new ColaPacientes();
        Paciente p1 = new Paciente("Adri", false);
        Paciente p2 = new Paciente("Mario", false);
        Paciente p3 = new Paciente("Mar", false);
        Paciente p4 = new Paciente("Javi", true);
        cp.agregaPaciente(p1);
        cp.agregaPaciente(p2);
        cp.agregaPaciente(p3);
        cp.agregaPaciente(p4);
        while (!(cp.isColaVacia())) {
            try {
                System.out.println("");
                cp.vacunaSiguiente();
                System.out.println("Vacunacion con exito.");
            } catch (PacienteVacunadoException e) {
                System.out.println("Hay que estar aburrido para querer vacunarse dos veces");
            }
        }
        System.out.println("Todos los pacientes han sido vacunados con exito.");
    }
}
