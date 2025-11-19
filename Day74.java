package Package;

import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        //Latihan: do while: Membuat Menu Berulang
        Scanner sc = new Scanner(System.in);
        int pilihMenu;
        
        do {
            System.out.println("=============MENU===========");
            System.out.println("1. Kentang Goreng");
            System.out.println("2. Banana Roll");
            System.out.println("3. Tela-Tela");
            System.out.println("4. Bakso Bakar");
            System.out.println("Pilihan: ");
            pilihMenu = sc.nextInt();
            
            switch (pilihMenu) {
                case 1:
                    System.out.println("Kentang Goreng");
                    break;
                case 2:
                    System.out.println("Banana Roll");
                    break;
                case 3:
                    System.out.println("Tela-Tela");
                    break;
                case 4:
                    System.out.println("Bakso Bakar");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
            
            
        } while (pilihMenu != 3);
    }
    
}
