package Package;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        //Latihan: Membuat Menu Menggunakan Switch-case
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Pilih Menu : ");
        System.out.println("========================================");
        System.out.println("1. Nasi goreng hati ampela");
        System.out.println("2. Ayam geprek sambal lada hitam");
        System.out.println("3. Mie ayam");
        System.out.println("4. Nasi ayam lalapan");
        System.out.println("5. Nasi ikan lalapan");
        System.out.println("6. Bakso");
        System.out.println("=======================================");
        int menu = sc.nextInt();
        
        switch (menu) {
            case 1:
                System.out.println("1. Nasi goreng hati ampela");
                break;
            case 2:
                System.out.println("2. Ayam geprek sambal lada hitam");
                break;
            case 3:
                System.out.println("3. Mie ayam");
                break;
            case 4:
                System.out.println("4. Nasi ayam lalapan");
                break;
            case 5:
                System.out.println("5. Nasi ikan lalapan");
                break;
            case 6:
                System.out.println("6. Bakso");
                break;    
            default:
                System.out.println("Tidak ada di menu");
        }
    }
    
}
