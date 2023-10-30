package hernandezsoteroies.es;

public class PruebaPersona {
    public static void main(String arg[]) {
        Persona marco;
        Persona luz;
        marco = new Persona();
        luz = new Persona();
        marco.cambiaNombre("Pepe");
        marco.cambiaEdad(18);
        luz.cambiaNombre("Pepa");
        luz.cambiaEdad(19);
        marco.imprimeEdad();
        marco.imprimeEstadoCivil();
        marco.imprimeEstadoTrabajo();
        marco.imprimeNombre();
        luz.imprimeEdad();
        luz.imprimeEstadoCivil();
        luz.imprimeEstadoTrabajo();
        luz.imprimeNombre();
        marco.consigueTrabajo();
        marco.pierdeTrabajo();
        marco.consigueTrabajo();
        luz.consigueTrabajo();
        marco.cambiaEdad(30);
        luz.cambiaEdad(31);
        marco.seCasa();
        luz.seCasa();
        marco.seDivorcia();
        marco.imprimeEdad();
        marco.imprimeEstadoCivil();
        marco.imprimeEstadoTrabajo();
        marco.imprimeNombre();
        luz.imprimeEdad();
        luz.imprimeEstadoCivil();
        luz.imprimeEstadoTrabajo();
        luz.imprimeNombre();

    }

}
