package Package;

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        //Method String untuk Pengecekan (equals(), equalIgnoreCase(), contains(), isEmpty()).
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan teks pertama: ");
        String a = sc.nextLine();
        
        System.out.println("Masukkan teks kedua: ");
        String b = sc.nextLine();
        
        System.out.println("Masukkan kata yang akan dicek di teks pertama:  ");
        String cek = sc.nextLine();
        
        System.out.println("========HASIL========");
        
        System.out.println("a.equals(b): "+ a.equals(b));
        System.out.println("a.equlasIgnoreCase(b): " + a.equalsIgnoreCase(b));
        System.out.println("a.contains(cek): "+ a.contains(cek));
        System.out.println("a.isEmpty(): "+ a.isEmpty());
    }
}
