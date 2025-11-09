package Package;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = sc.nextInt();

        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Hasil perkalian 1 sampai " + n + " = " + hasil);
    }
}
