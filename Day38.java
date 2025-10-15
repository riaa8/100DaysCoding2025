package Package;

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan angka : ");
        int angka = sc.nextInt();

        if (angka > 0) {
            System.out.println("Positif" );
        } else if (angka < 0) {
            System.out.println("Negatif" );
        } else {
            System.out.println("Nol (0)" );
        }
    }
}

