package Package;

import java.util.Scanner;

public class Day87 {

    public static void main(String[] args) {
        //Latihan: Mencari Elemen pada Array

        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah elemen: ");
        int n = sc.nextInt();
        int r[] = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }

        System.out.print("Cari nilai: ");
        int key = sc.nextInt();
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (r[i] == key) {
                idx = i;
                break;
            }
        }

        if (idx >= 0) {
            System.out.println("Nilai ditemukan pada indeks = " + idx);
        } else {
            System.out.println("Nilai tidak ditemukan");
        }

    }

}
