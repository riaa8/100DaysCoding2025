package Package;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan umur kamu: ");
        int umur = sc.nextInt();

        System.out.print("Apakah sudah menyelesaikan tugas? : ");
        boolean tugasSelesai = sc.nextBoolean();

        System.out.print("Apakah hari ini hari Minggu? : ");
        boolean weekend = sc.nextBoolean();

        System.out.println("=======================================");
        if ((umur >= 20 && tugasSelesai) || weekend) {
            System.out.println("Boleh pergi healing");
        } else {
            System.out.println("Tidak boleh healing dulu yaaa");
        }
    }
    
}
