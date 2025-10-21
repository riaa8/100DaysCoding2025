package Package;

import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai :");
        int nilai = sc.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Nilai yang kamu dapat\n" + nilai + "\nA");
        } else if (nilai >= 75 && nilai <= 84) {
            System.out.println("Nilai yang kamu dapat\n" + nilai + "\nB");
        } else if (nilai >= 65 && nilai <= 74) {
            System.out.println("Nilai yang kamu dapat\n" + nilai + "\nC");
        } else if (nilai >= 45 && nilai <= 64) {
            System.out.println("Nilai yang kamu dapat\n" + nilai + "\nD");
        } else {
            System.out.println("Nilai yang kamu dapat\n" + nilai + "\nE");

        }

    }

}
