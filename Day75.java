package Package;

import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        //Method String Dasar (length(), toUpperCase(), toLowerCase())
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Teks: ");
        
        String teks = sc.nextLine();
        
        System.out.println("Panjang: "+ teks.length());
        System.out.println("Uppercase: " + teks.toUpperCase());
        System.out.println("Lowercase: " + teks.toLowerCase());
        
    }
    
}
