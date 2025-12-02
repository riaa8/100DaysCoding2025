package Package;

import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("batas array = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("masukan elemen array "+(i+1)+" = ");
            a[i]= sc.nextInt();
        }
        int min = a[0]; 
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) { 
                min = a[i];   
            }
        }
        System.out.println("nilai min = "+min);
    }
}
