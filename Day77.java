package Package;

import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        //Method String Manipulasi
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan Teks: ");
        String teks = sc.nextLine();
        
        if (teks.length() >= 10) {
            System.out.println("Substring (0-8): " + teks.substring(0,9));
            
        }else {
            System.out.println("Substring (0-8): teksnya terlalu pendek");
        }
        
        System.out.println("Masukkan kata yang ingin diganti: ");
        String kataLama = sc.nextLine();
        
        System.out.println("Masukkan kata ganti: ");
        String kataBaru = sc.nextLine();
        
        System.out.println("Replace : " + teks.replace(kataLama, kataBaru));
        
        System.out.println("Trim: " + teks.trim() + " ");
        
       
    }
    
}
