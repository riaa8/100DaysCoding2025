package Evaluasi_2;

import java.util.Scanner;

public class soal_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Masukkan panjang rumah :");
        int P = sc.nextInt();
        System.out.println("Masukkan lebar rumah:");
        int L = sc.nextInt();
        
        int ukuranKeramik = 2;
        
        int jumlahKeramik_P = P / ukuranKeramik;
        int jumlahKeramik_L = L / ukuranKeramik;
        
        int totalKeramik = jumlahKeramik_P * jumlahKeramik_L;
        
        System.out.println("Total keramik yang dibutuhkan = " + totalKeramik);
    }
    
}
