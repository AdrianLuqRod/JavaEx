package e10;

import java.util.Scanner;

public class PruebaCuentaCorriente {
    static CuentaCorriente cc1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws DatosCuentaInvalidosException {
        boolean flag = false;
        int op = 0;
        do {
            System.out.println("0-SALIR");
            System.out.println("1-Conectar con tu cuenta");
            System.out.println("2-Consultar saldo");
            System.out.println("3-Ingresar dinero");
            System.out.println("4-Abonar una compra");
            System.out.println("Elige una opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Adioooos.");
                    break;

                case 1:
                    conectarCuenta();
                    flag = true;
                    break;

                case 2:
                    if (!flag) {
                        System.out.println("Primero debes conectar tu cuenta");
                        break;
                    }
                    consultarSaldo();
                    break;

                case 3:
                    if (!flag) {
                        System.out.println("Primero debes conectar tu cuenta");
                        break;
                    }
                    ingresaDinero();
                    break;

                case 4:
                    if (!flag) {
                        System.out.println("Primero debes conectar tu cuenta");
                        break;
                    }
                    abonarCompra();
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (op != 0);
    }

    private static void conectarCuenta() {
        try {
            cc1 = new CuentaCorriente(1000, 1234);
            System.out.println("Cuenta conectada con exito");
            System.out.println("");
        } catch (DatosCuentaInvalidosException e) {
            System.out.println(e);
        }

    }

    private static void consultarSaldo() {
        System.out.println(cc1.consultaSaldo());
    }

    private static void ingresaDinero() {
        System.out.println("Introduce el importe: ");
        double imp = sc.nextDouble();
        System.out.println("Introduce el pin de la cuenta: ");
        int pin = sc.nextInt();
        try {
            cc1.ingresa(imp, pin);
        } catch (PinIncorrectoException | ImporteIncorrectoException e) {
            System.out.println(e);
        }
    }

    private static void abonarCompra() {
        System.out.println("Introduce el importe: ");
        double imp = sc.nextDouble();
        System.out.println("Introduce el pin de la cuenta: ");
        int pin = sc.nextInt();
        try {
            cc1.abona(imp, pin);
        } catch (ImporteIncorrectoException | PinIncorrectoException e) {
            System.out.println(e);
        }
    }
}
