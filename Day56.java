package Package;
import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka yang ingin dikalikan: ");
        int angka = sc.nextInt();
        
        int i = 1;
        
        do {
            System.out.println(angka + " x " + i + " = " + (angka * i));
            i++;
        } while (i <= 10);
    }
}
