package Package;

import java.util.Scanner;

public class Day99 {

    static boolean prima(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = sc.nextInt();
        System.out.println("Bilangan prima 1 - " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (prima(i)) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }
}
