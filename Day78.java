package Package;

import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        //Latihan Method String
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan teks: ");
        String teks = sc.nextLine();
        
        System.out.println("Upper: " + teks.toUpperCase());
        System.out.println("Lowwer: " + teks.toLowerCase());
        System.out.println("Panjang: " + teks.length());
        System.out.println("Mengandung 'a'? : " + teks.contains("a"));
    }
    
}
