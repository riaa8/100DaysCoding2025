package Package;

import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] angka = new int[n]; 
        System.out.println("Masukkan " + n + " bilangan bulat:");
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        int min = angka[0];
        int max = angka[0];
        for (int i = 1; i < n; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("\nNilai minimum: " + min);
        System.out.println("Nilai maksimum: " + max);
    }
}


