package Package;

import java.util.Scanner;

public class Day97 {
    //Latihan: Menghitung Luas Persegi dengan Method Non-void dan parameternya
    static int persegi(int sisi){
        return sisi * sisi;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sisi: ");
        int a = sc.nextInt();
        System.out.println("Luas = " + persegi (a));
    }
    
}
