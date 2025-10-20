package Package;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        //Latihan: Program Kelipatan 3,5, 3 dan 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Kelipatan 3 dan 5");
        } else if (angka % 3 == 0) {
            System.out.println("Kelipatan 3");
        } else if (angka % 5 == 0) {
            System.out.println("Kelipatan 5");
        } else {
            System.out.println("Bukan kelipatan 3 atau 5");
        }
    }
}

