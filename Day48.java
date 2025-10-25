package Package;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operasi = sc.next().charAt(0);
        

        switch (operasi) {
            case '+':
                System.out.println("Hasil: " + (a + b));
                break;
            case '-' : 
               System.out.println("Hasil: " + (a - b));
               break;
            case '*' :
                System.out.println("Hasil: " + (a * b));
                break;
            case '/' : 
                System.out.println("Hasil: " + (a / b));
                break;
            default :
                System.out.println("Operator tidak dikenal!");
        }

    }
}


