package Package;

import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("batas array = ");
        int n = sc.nextInt();
        int a[]= new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("masukan elemen array "+(i+1)+" = ");
            a[i]= sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];   
            }
        }
        System.out.println("nilai max = "+max);
    }
}
