package DayOfCoding;

public class Day14 {

    public static void main(String[] args) {
        //1. String ke byte
        String bilbul_byte = "18";
        byte by = Byte.parseByte(bilbul_byte);
        System.out.println(by);

        //2. String ke short
        String bilbul_short = "17";
        short sh = Short.parseShort(bilbul_short);
        System.out.println(sh);

        //3. String ke int
        String bilbul_int = "16";
        int in = Integer.parseInt(bilbul_int);
        System.out.println(in);

        //4. String ke long
        String bilbul_long = "15";
        long lo = Long.parseLong(bilbul_int);
        System.out.println(lo);

        //5. String ke float
        String bildes_float = "10.04";
        float fl = Float.parseFloat(bildes_float);
        System.out.println(fl);

        //6. String ke double
        String bildes_double = "10.50";
        double d = Double.parseDouble(bildes_double);
        System.out.println(d);

        //7. String ke Char
        String chr = "R";
        char ch = chr.charAt(0);
        System.out.println(ch);

        // String ke boolean
        String bool = "true";
        boolean boo = Boolean.parseBoolean(bool);
        System.out.println(boo);

    }

}
