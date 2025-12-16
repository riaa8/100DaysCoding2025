package Package;

import java.util.*;

public class Day100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <Integer> a = new ArrayList<>();
        
        System.out.println("masukkan nilai: ");       
        for (int i = 0; i < 10; i++) {
            a.add(sc.nextInt());
            
        }   
            System.out.println("menampilkan nilai asli: "+ a);
        
            System.out.println(a.get(3));
            System.out.println(a.get(6));
            System.out.println(a.get(9));
            
            System.out.println("sebelum di hapus: " + a);
            System.out.println(a.remove(1));
            System.out.println(a.remove(2));
            System.out.println(a.remove(5));
            
            System.out.println("setelah di hapus: " + a);
            System.out.println(a.size());
    }
}
    
    

