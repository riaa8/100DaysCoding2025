package DayOfCoding;
public class Day5 {
    public static void main(String[] args) {
        byte kecil = 127; // byte Menyimpan bilangan bulat dari -128 hingga 127
        short sedang = 18100; //short Menyimpan bilangan bulat dari -32.768 hingga 32.767
        int besar = 20041018; //int Menyimpan bilangan bulat dari -2.147.483.648 hingga 2.147.483.647
        long sangatBesar = 1000000000L; //long Menyimpan bilangan bulat dari -9.223.372.036.854.775.808 hingga 9.223.372.036.854.775.807
        
        System.out.println("Byte :" + kecil);
        System.out.println("Short :" + sedang);
        System.out.println("Integer :" + besar);
        System.out.println("Long :" + sangatBesar);
    }
    
}
