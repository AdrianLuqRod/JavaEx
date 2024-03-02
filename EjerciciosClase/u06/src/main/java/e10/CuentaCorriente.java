package e10;

public class CuentaCorriente {
    private double saldoActual;
    private int pin;

    public CuentaCorriente(double saldoActual, int pin) throws DatosCuentaInvalidosException {
        if (saldoActual < 0 || pin < 0 && pin > 9999) {
            throw new DatosCuentaInvalidosException("El saldo o el pin tienen unos valores incorrectos.");
        }
        this.saldoActual = saldoActual;
        this.pin = pin;
    }

    public double consultaSaldo() {
        return saldoActual;
    }

    public void ingresa(double importe, int pin) throws PinIncorrectoException, ImporteIncorrectoException {
        if (pin != this.pin) {
            throw new PinIncorrectoException("El pin no coincide.");
        }
        if (importe <= 0) {
            throw new ImporteIncorrectoException("Importe no valido: " + importe);
        }
        saldoActual += importe;
    }

    public void abona(double importe, int pin) throws ImporteIncorrectoException, PinIncorrectoException {
        if (pin != this.pin) {
            throw new PinIncorrectoException("El pin no coincide.");
        }
        if (importe <= 0) {
            throw new ImporteIncorrectoException("Importe no valido: " + importe);
        }
        saldoActual -= importe;
    }

}
