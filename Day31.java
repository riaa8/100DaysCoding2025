package Package;
public class Day31 {
    public static void main(String[] args) {
        //Operator Logika AND (&&)
        int umur = 20;
        boolean punyaTiket = true;
        
        // disini saya menggunakan operator logika && untuk menggabungkan kondisi
        boolean bolehMasuk = (umur >= 17) && punyaTiket;
        System.out.println("Umur : " + umur);
        System.out.println("Punya Tiket : " + punyaTiket);
        System.out.println("Boleh Masuk? : " + bolehMasuk);
    }
    
}
