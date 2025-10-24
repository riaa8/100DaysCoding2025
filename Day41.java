package Evaluasi_3;

import java.util.Scanner;

public class soal_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Jenkel (laki-laki / perempuan) :");
        String jenkel = sc.next();
        System.out.println("umur : ");
        int umur = sc.nextInt();
        
        if (jenkel.equalsIgnoreCase("laki-laki")) {
            if (umur <= 14) {
                System.out.println("seorang laki-laki berumur " + umur + " tahun, masih anak-anak");
            }else if (umur >= 15 && umur <= 20) {
                System.out.println("seorang laki-laki berumur " + umur + " tahun, sudah remaja");
            }else if (umur >= 21 && umur <=50) {
                System.out.println("seorang laki-laki berumur " + umur + " tahun, sudah dewasa");
            }else{
                System.out.println("Diabaikan karena bukan laki-laki");
            }
        }
    }
    
}
