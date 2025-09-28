package Package;
public class Day21 {
    public static void main(String[] args) {
        //Latihan: Program untuk menukar nilai dua variabel.
        int a = 3;
        int b = 5;
        System.out.println("nilai sebelum di tukar. a = " + a);
        System.out.println("nilai sebelum di tukar. b = " + b);
        a = b - a;
        b = b - a;
        a = b + a;
        System.out.println("nilai setelah ditukar. a = " + a);
        System.out.println("nulai setelah ditukar. b = " + b);
    }
    
}

