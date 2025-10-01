package Package;
public class Day25 {
    public static void main(String[] args) {
        int a = 10;
        // Post-increment (a++)
        System.out.println("Nilai awal a: " + a);   // 10
        System.out.println("Cetak a++ : " + (a++)); // cetak dulu 10, lalu a = 11
        System.out.println("Setelah a++ : " + a);   // sekarang nilainya 11

        System.out.println("----------------");

        int b = 10;
        // Pre-increment (++b)
        System.out.println("Nilai awal b: " + b);   // 10
        System.out.println("Cetak ++b : " + (++b)); // naikkan dulu ke 11, baru cetak
        System.out.println("Setelah ++b : " + b);   // tetap 11

        System.out.println("----------------");

        int c = 10;
        // Post-decrement (c--)
        System.out.println("Nilai awal c: " + c);   // 10
        System.out.println("Cetak c-- : " + (c--)); // cetak dulu 10, lalu c = 9
        System.out.println("Setelah c-- : " + c);   // sekarang nilainya 9

        System.out.println("----------------");

        int d = 10;
        // Pre-decrement (--d)
        System.out.println("Nilai awal d: " + d);   // 10
        System.out.println("Cetak --d : " + (--d)); // kurangi dulu ke 9, baru cetak
        System.out.println("Setelah --d : " + d);   // tetap 9
    }
}


