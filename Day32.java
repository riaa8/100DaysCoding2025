package Package;

import java.util.Scanner;

public class Day32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai :");
        int nilai = sc.nextInt();

        System.out.println("Total pertemuan : ");
        int pertemuan = sc.nextInt();
        if (nilai >= 80 || pertemuan >= 15) {
            System.out.println("lulus");
        } else {
            System.out.println("tidak lulus");
        }
    }

}
