package Package;

import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Elemen ke- " + i + ": ");
            arr[i] = sc.nextInt();   
        }
        System.out.println("Isi array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
            
        }
        
        
    }
    
}
