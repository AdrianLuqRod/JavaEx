package es.casa;

// - A partir de aquí se empieza a dar el switch a parte de los if/else.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Escribe un numero del 1 al 5:");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                System.out.println("Por el culo te la hinco");
                break;
            case 2:
                System.out.println("Por el culo te la hinco");
                break;
            case 3:
                System.out.println("Por el culo te la hinco");
                break;
            case 4:
                System.out.println("Por el culo te la hinco");
                break;
            case 5:
                System.out.println("Por el culo te la hinco");
                break;

            default:
                System.out.println("No me sirve.");
                break;
        }
        sc.close();
    }

}