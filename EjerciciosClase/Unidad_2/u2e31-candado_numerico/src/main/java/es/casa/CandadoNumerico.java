package es.casa;

public class CandadoNumerico {
    public int numSecreto;

    public void setNumSecreto(int numSecreto) {
        this.numSecreto = numSecreto;
    }

    public boolean seAbreCon(int numero) {
        if (numero == numSecreto) {
            return true;
        } else {
            return false;
        }

    }
}
