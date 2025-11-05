package Package;

import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        System.out.print("Ganjil: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }

        System.out.print("\nGenap: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
    }
}
