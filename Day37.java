package Package;

import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = sc.nextInt();
        if (angka % 2 == 0 && angka > 0) {
            System.out.println("Genap");
        } else if(angka <= 0){
            System.out.println("Angka harus diatas nol (0)");
        }else{
            System.out.println("Ganjil");
        }
    }
}
