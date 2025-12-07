package Package;
public class Day91 {
    static void cetakPersegi(int ukuran) {
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        cetakPersegi(4); // ukuran dikirim sebagai parameter
    }
}
    
