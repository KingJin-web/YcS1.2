package JavaApi.D0806;

import java.io.File;

public class Dome {
    public static void main(String[] args) {
        a();
        b();
        c();
    }

    public static void a() {
        int a = 1;
        Integer A = new Integer(1);
        System.out.println(a + " " + A);
    }

    public static void b() {
        String str = "100";
        Byte objByte = Byte.valueOf(str);
        System.out.println(objByte);
        Short objShort = Short.valueOf(str);
        System.out.println(objShort);
        Integer objInt = Integer.valueOf(str);
        System.out.println(objInt);
        Long obkLong = Long.valueOf(str);
        System.out.println(obkLong);

    }

    public static void c() {
        char c = 'A';
        Character C = new Character(c);
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isLetter(c));
    }

    public static void d() {
        String str = "116";
        int i = Integer.parseInt(str);
        short s = Short.parseShort(str);
        byte b = Byte.parseByte(str);
        long l = Long.parseLong(str);
        float f = Float.valueOf(str);
        double d = Double.valueOf(str);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        System.out.println(l);


    }
}
