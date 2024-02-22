package e03;

import java.util.ArrayList;
import java.util.List;

import e01.NombreDuplicadoException;

public class NombresUnicos {
    private List<String> lista;

    public NombresUnicos() {
        lista = new ArrayList<>();
    }

    public void agregaNombre(String nombre) throws NombreDuplicadoException {
        if (yaExiste(nombre)) {
            throw new NombreDuplicadoException();
        }
        lista.add(nombre);
    }

    public boolean yaExiste(String nombre) {
        for (String str : lista) {
            if (str.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
}
