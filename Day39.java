package Package;

import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        //Latihan: Membuat Menu menggunakan if
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilihan Menu: ");
        System.out.println("=======================");
        System.out.println("1. Ayam geprek bakar ");
        System.out.println("2. Mie Ayam ");
        System.out.println("3. Gacoan");
        System.out.println("=======================");
        System.out.println("pilih menu mu :");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.println("Kamu memilih ayam geprek bakar");
        } else if (pilihan == 2) {
            System.out.println("Kamu memilih Mie ayam");
        } else if (pilihan == 3) {
            System.out.println("Kamu memilih Gacoan");
        } else {
            System.out.println("Pilihan menu tidak tersedia");
        }
    }

}
