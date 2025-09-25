package Package;
public class Day18 {
    public static void main(String[] args) {
        // byte ke int
        byte b = 50;
        int i = b; // otomatis byte -> int
        
        // int ke long
        int angka = 1000;
        long l = angka; // otomatis int -> long

        // long ke float
        long nilaiLong = 50000L;
        float f = nilaiLong; // otomatis long -> float
        
        System.out.println("byte ke int: " + i);
        System.out.println("int ke long: " + l);
        System.out.println("long ke float: " + f);
    }
    
}
