package Package;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai : ");
        int nilaiMahasiswa = sc.nextInt();
        String nilai = "";
        if (nilaiMahasiswa >= 90 && nilaiMahasiswa <=100) {
            nilai = "A";
            System.out.println("nilai = " + nilai);

        } else if (nilaiMahasiswa >= 70 && nilaiMahasiswa<=89 ) {
            nilai = "B";
            System.out.println("nilai = " + nilai);
        } else if (nilaiMahasiswa >= 50 && nilaiMahasiswa <=69) {
            nilai = "C";
            System.out.println("nilai " + nilai);
        } else {
            nilai = "D";
            System.out.println("Tidak lulus = "+ nilai);
        }

    }

}
