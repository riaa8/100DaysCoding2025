package Package;
public class Day26 {
    public static void main(String[] args) {
        //Operator Penugasan (=, +=, -=, dll).
        int x = 20;
         
        x += 5; // sama dengan x = x + 5
        System.out.println("x += 5: " + x);

        x -= 3; // sama dengan x = x - 3
        System.out.println("x -= 3: " + x);

        x *= 2; // sama dengan x = x * 2
        System.out.println("x *= 2: " + x);

        x /= 4; // sama dengan x = x / 4
        System.out.println("x /= 4: " + x);
        
        x %= 4;
        System.out.println("x %= 4 " + x);
    }
    
}
