package Package;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        //Operator Ternary
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur kamu: ");
        int umur = sc.nextInt(); 
       
        String status = (umur >= 17 && umur <= 59 )? "Dewasa" : (  umur >= 60) ?  "Lansia" : "Belum Dewasa"  ;

        System.out.println("Status kamu: " + status);

    }
}


