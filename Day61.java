package Package;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = sc.nextInt();
        System.out.print("Masukkan kelipatan M: ");
        int m = sc.nextInt();

        System.out.print("Bilangan kelipatan " + m + " dari 1-" + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) System.out.print(i + " ");
        }
    }
}
