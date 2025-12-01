
package Package;

import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("masukan elemen array = ");
            a[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            total += a[i];
            if (i < n-1) {
                System.out.print(" + ");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println(" = "+total);
    }
}
