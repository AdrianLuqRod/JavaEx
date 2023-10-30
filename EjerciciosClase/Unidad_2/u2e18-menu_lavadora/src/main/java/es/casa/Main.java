package es.casa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Pon el numero en el que empiece la lavadora: ");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                System.out.println(
                        "1-Prelavado\n2-Lavado\n3-Centrifugado\n4-Fin");
                break;
            case 2:
                System.out.println(
                        "2-Lavado\n3-Centrifugado\n4-Fin");
            case 3:
                System.out.println(
                        "3-Centrifugado\n4-Fin");
                break;
            case 4:
                System.out.println(
                        "4-Fin");
                break;
            case 5:
                System.out.println(
                        "5-Prelavado\n6-Lavado en caliente\n7-Centrifugado 1\n8-LAvado en frío\n9-Suavizante\n10-Centrifugado 2\n11-Secado\n12-Fin");
                break;
            case 6:
                System.out.println(
                        "6-Lavado en caliente\n7-Centrifugado 1\n8-LAvado en frío\n9-Suavizante\n10-Centrifugado 2\n11-Secado\n12-Fin");
                break;
            case 7:
                System.out.println(
                        "7-Centrifugado 1\n8-LAvado en frío\n9-Suavizante\n10-Centrifugado 2\n11-Secado\n12-Fin");
                break;
            case 8:
                System.out.println("8-LAvado en frío\n9-Suavizante\n10-Centrifugado 2\n11-Secado\n12-Fin");
                break;
            case 9:
                System.out.println("9-Suavizante\n10-Centrifugado 2\n11-Secado\n12-Fin");
                break;
            case 10:
                System.out.println("10-Centrifugado 2\n11-Secado\n12-Fin");
                break;
            case 11:
                System.out.println("11-Secado\n12-Fin");
                break;
            case 12:
                System.out.println("12-Fin");
                break;

            default:
                System.out.println("Opción incorrecta.");
                break;
        }
        sc.close();
    }
}