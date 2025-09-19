package DayOfCoding;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nama:");
        String nm = sc.nextLine();
        
        System.out.print("masukkan umur:");
        int um = sc.nextInt();
        
        System.out.print("masukkan alamat:");
        String alamat = sc.nextLine();
        
        System.out.print("masukkan univ: ");
        String un = sc.nextLine();
        
        System.out.println("==============BIODATA=============");
        System.out.println("Nama : " + nm);
        System.out.println("Umur : " + um);
        System.out.println("Alamat : " + alamat);
        System.out.println("Kampus : " + un);
    }
    
}
