import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int i = 2000;
        Object o = i;
        i = 2001;
        int j = (int) o;
        System.out.print("i=" + i + "o=" + o + ",j=" + j);

        Integer a = new Integer(3);
        Integer b = new Integer(3);
        System.out.println(a.equals(b));

        String s = "HELLO,WORLD";
        s.replace(",", " ");
        System.out.println(s);

        s = null;
        s.concat("abc");
    }
}

class a {
    public static void main(String[] args) {
        System.out.println("abc".equals("Abc"));
        System.out.println("".equals(null));
        System.out.println("abc" == "ab" + "c");
        System.out.println("".equalsIgnoreCase(null));

        String a = "ababcdabcdefg";
        System.out.println(a.indexOf("a"));
        System.out.println(a.lastIndexOf("a"));
        System.out.println(Arrays.toString(a.getBytes()));


    }
}

class Test{
    public static void main (String[] args) {
        int x=5;
        Integer x1=x;
        Integer x2=x;
        int x3=new Integer(5);
        System.out.print(x1.equals(x));
        System.out.print(x1==x);
        System.out.print(x2.equals(x1));
        System.out.print(x2==x1);
        System.out.print(x2==x3);
        System.out.print(x2.equals(x3));
    }
}


