package DayOfCoding;
public class Day4 {
    public static void main(String[] args) {
        
        // 1. Menggunakan println (otomatis ganti baris)
        System.out.println("=== Menggunakan println ===");
        System.out.println("Hay Guys\nKenalin"); // (\n--> ganti baris/baris baru)
        System.out.println("Nama:\tRIA RAMADANI\n "); //(\t--> Tab baris dan \n untuk baris baru)

        // 2. Menggunakan print (tidak otomatis ganti baris)
        System.out.println("=== Menggunakan print ===");
        System.out.print("Ini teks pertama ");
        System.out.print("masih di baris yang sama\n");
        System.out.print("Tab:\tHalo World\n\n");

        // 3. Menggunakan printf (formatting + escape sequence)
        System.out.println("=== Menggunakan printf ===");
        String nama = "Ria";
        int umur = 20;
        double bb = 42.75;

        System.out.printf("Nama:\t%s\n", nama); // (%s --> digunakan untuk tipe data String)
        System.out.printf("Umur:\t%d tahun\n", umur); //(%d --> digunakan untuk tipe data decimal/bilangan bulat)
        System.out.printf("Berat Badan:\t%.2f\n", bb); // (%.2f --> digunakan untuk tipe data bilangan pecahan)
        System.out.printf("Note:\t\"Semangat Yaaaa!\"\n");
        
    }
}

