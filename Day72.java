package Package;

import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        //Latihan: Membuat Pola Segi Tiga Siku-Siku Terbalik
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int n = sc.nextInt();
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
                
            }
            System.out.println();
    }

  }    
}
