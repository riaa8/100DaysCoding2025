package Package;

import java.util.Scanner;

public class Day98 {
    // Latihan: Deretan Fibonacci dari 1-N
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan bilangan fibonacci: ");
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(b + (i==n? "" : " "));
            int next = a + b;
            a = b; 
            b = next;
        }
        System.out.println();
        }
        
    }
    

