package Package;

import java.util.Scanner;

public class Day96 {
    //Latihan: Menghitung Penjumlahan, Pengurangan, Perkalian dan Pembagian dengan Method Non-void
    static double aritmatika (char operator, double a, double b){
        double hasil;
        
        switch (operator) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                hasil = a / b;
                break;
            case '%':
                hasil = a % b;
                break;
            default:
                System.out.println("operator tidak ada");
                hasil = Double.NaN;
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("operator (+ - * / %): ");
        char op = sc.next().charAt(0);

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.println("Hasil: " + aritmatika(op, a, b));
        
    }
    
}
