package Package;

import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        //Mengakses Elemen Array dengan Menggunakan For-each
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah elemen: ");
        int n = sc.nextInt();
        int r[] = new int[n];
        System.out.println("Masukkan elemen:");
        for (int i = 0; i < n; i++){
            r[i] = sc.nextInt();
        }

        System.out.println("Menampilkan elemen dengan for-each:");
        for (int v : r){
            System.out.print(v + " ");
        }
        System.out.println();
    }
    
}
