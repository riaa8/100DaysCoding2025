package Package;

import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        //Latihan: Membuat Akun dan Login Ke Akun (Menggunakan loop berhenti ketika user dan pwnya benar)
        Scanner sc = new Scanner (System.in);

        String user = "riaa";
        String pass = "1810";

        String u, p;

        do {
            System.out.print("Username: ");
            u = sc.nextLine();
            System.out.print("Password: ");
            p = sc.nextLine();

            if (!u.equals(user) || !p.equals(pass))
                System.out.println("Login gagal, coba lagi!\n");

        } while (!u.equals(user) || !p.equals(pass));

        System.out.println("Login berhasil!");

    }
    
}
