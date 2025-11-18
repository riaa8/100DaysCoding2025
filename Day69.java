package Evaluasi_5;

import java.util.Scanner;

public class soal_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan bilangan bulat positif: ");
        
        int N = sc.nextInt();
        int hitungNol = 0;
        
        for (char a : String.valueOf(N).toCharArray()) {
            if (a == '0') {
                hitungNol++;
            }

        }
        System.out.println(hitungNol);
    }
    
}
