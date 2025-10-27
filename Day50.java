package Package;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = sc.nextInt();
        
//        String hasil = (angka % 2 == 0 && angka > 0 )? "Genap" :
//                       (angka % 2 == 1 && angka > 0 )? "Ganjil" : "angka tidak lebih dari 1";
//      
        String hasil = null;
        if (angka > 0) {
           hasil = (angka % 2 == 0 )? "Genap" : "Ganjil";
           
        System.out.println("Angka " + angka + " adalah bilangan " + hasil  );
        }else{
            System.out.println("angka tidak lebih dari 1");
        }

    }
    
}
