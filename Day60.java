package Package;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        System.out.println("Bialangan ganjil dan N ke 1: ");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) System.out.print(i + " ");
        }

        System.out.println("\nBilangan genap dari N ke 1: ");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) System.out.print(i + " ");
           }
        }
    }
    

