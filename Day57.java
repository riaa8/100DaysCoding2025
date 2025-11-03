package Package;

import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan ukuran pola : ");
        int ukuran = sc.nextInt();
        
        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                System.out.print("* ");
            }
            System.out.println(""); 
        }
        
    }
    
}
