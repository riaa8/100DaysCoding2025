package Package;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harta = 120_000_000;
        System.out.print("Masukkan biaya admin (%): ");
        double x = sc.nextDouble();

        double potongan = harta * x / 100;
        double sisa = harta - potongan;
        double bagian = sisa / 3;

        System.out.printf("Total harta: Rp%.0f\n", harta);
        System.out.printf("Potongan admin: Rp%.0f\n", potongan);
        System.out.printf("Sisa dibagi rata: Rp%.0f\n", sisa);
        System.out.println("Masing-masing mendapat: Rp" + bagian);
    }
    
}
