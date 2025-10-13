package Package;

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah kamu laki-laki? : ");
        boolean lakiLaki = sc.nextBoolean();

        System.out.print("Masukkan umur kamu: ");
        int umur = sc.nextInt();

        if (lakiLaki) { 
            if (umur <= 10) {
                System.out.println("laki-laki, masih anak-anak ");
            } else if (umur <= 18) {
                System.out.println("seorang laki-laki,seorang remaja ");
            } else {
                System.out.println("seorang laki-laki, sudah dewasa ");
            }
        }
    }
}
