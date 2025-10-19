package Package;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        //Latihan: Menentukan Gaji Bersih
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        double gaji = sc.nextDouble();
        System.out.print("Masukkan potongan: ");
        double potongan = sc.nextDouble();

        double gajiBersih = gaji - potongan;
        System.out.println("Gaji bersih kamu adalah: Rp" + gajiBersih);
      
    }
}

