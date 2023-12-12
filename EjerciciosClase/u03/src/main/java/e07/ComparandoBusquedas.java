package e07;

import java.util.*;

public class ComparandoBusquedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] nums = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(1000000);
        }
<<<<<<< HEAD
        int[] copiaNums = Arrays.copyOf(nums, 10000);
        Arrays.sort(copiaNums);
        long antes = System.nanoTime();
        System.out.printf("Pon el numero que deseas buscar: ");
        int buscar = sc.nextInt();
        sc.nextLine();
        for (int i : nums) {
            if (i == buscar) {
=======
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums2);
        System.out.printf("Pon un numero para buscar: ");
        int busc = sc.nextInt();
        sc.nextLine();
        long antes = System.nanoTime();
        for (int i = 0; i < nums.length; i++) {
            if (busc == nums[i]) {
>>>>>>> d1dfcd335665d24d5e0621a6325bcb4e8f018d60
                break;
            }
        }
        long despues = System.nanoTime();
<<<<<<< HEAD
        long total = despues - antes;
        System.out.println(total);
        antes = System.nanoTime();
        Arrays.binarySearch(copiaNums, buscar);
        despues = System.nanoTime();
        total = despues - antes;
        System.out.println(total);
        sc.close();
    }

}
=======
        long total1 = despues - antes;
        System.out.println(total1);
        long antes2 = System.nanoTime();
        Arrays.binarySearch(nums2, busc);
        long despues2 = System.nanoTime();
        long total2 = despues2 - antes2;
        System.out.println(total2);
        sc.close();
    }
}
>>>>>>> d1dfcd335665d24d5e0621a6325bcb4e8f018d60
