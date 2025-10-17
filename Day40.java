package Package;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        //Latihan: Membuat Kalkulator menggunakan if

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double a = sc.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double b = sc.nextDouble();

        System.out.print("Pilih operasi (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Hasil: " + (a + b));
        } else if (op == '-') {
            System.out.println("Hasil: " + (a - b));
        } else if (op == '*') {
            System.out.println("Hasil: " + (a * b));
        } else if (op == '/') {
            System.out.println("Hasil: " + (a / b));
        } else {
            System.out.println("Operator tidak dikenal");
        }
    }
}

 
