package Package;

import java.util.Scanner;

public class Day33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int nilaiAktual = 18;
        System.out.println("Tebak Nilai Aktual dari rentan 1 - 20 : ");
        int tebakan = sc.nextInt();
        if (tebakan != nilaiAktual) {
            System.out.println("Tebakan salah harunya nilai aktual = " + nilaiAktual);
        } else {
            System.out.println("Benar");

        }

    }

}
