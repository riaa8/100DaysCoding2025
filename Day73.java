package Package;

import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        //Latihan: Penjumlahan Angka (berhenti ketika menginputkan angka negatif)
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int a;
        
        do {
            System.out.println("Angka negatif untuk berhenti: ");
            a = sc.nextInt();
            
            if (a >= 0) total += a;
        } while (a >= 0);
        
        System.out.println("total penjumlahan: " + total);
    }
    
}
