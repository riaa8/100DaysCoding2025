package Package;

import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nama = ");
        String nama = sc.nextLine();
        System.out.print("masukkan jumlah = ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(nama);
        }
    }
}
