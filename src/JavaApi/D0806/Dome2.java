package JavaApi.D0806;

import java.util.Objects;

public class Dome2 {
    public static void main(String[] args) {
        // a();
        //b();
        //c();
        d();
    }

    public static void a() {
        String a = "abc";
        System.out.println(a);
        a = "123";
        System.out.println(a);

        System.out.println("===构造方法===");
        a = new String();
        System.out.println(a);
        a = new String("efg");
        System.out.println(a);

        char[] cs = {'x', 'y', 'z'};
        a = new String(cs);
        System.out.println(a);

        byte[] bs = {98, 99, 100};
        a = new String(bs);
        System.out.println(a);

        System.out.println("==== 实例方法 ====");
        a = "123456789";
        System.out.println(" " + a.concat("456"));
        System.out.println(" " + a.indexOf("456"));
        System.out.println(" " + a.indexOf(654));

        a.replace("456", "hello");
        System.out.println(a);
        a = a.replace("456", "hello");
        System.out.println(a);

        System.out.println(a.length());

    }

    public static void b() {
        String a = "123";
        String b = "123";
        String c = new String("123");
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(b.equals(c));
    }

    public static void c() {
        String a = "你好";
        long stime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            a += "世界";
        }

        long etime = System.currentTimeMillis();

        System.out.println("b=" + a);
        System.out.println((etime - stime) / 1000 + "秒");

        StringBuffer sb = new StringBuffer();
        stime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("世界");
        }
        etime = System.currentTimeMillis();
        System.out.println("sb = " + sb);
        System.out.println((etime - stime) / 1000 + "秒");
    }

    public static void d() {
        Person p = new Person("武松", 12);
        System.out.println(p);
        Person p2 = new Person("武松", 12);
        System.out.println(p == p2);
        System.out.println(p.equals(p2));
    }


}


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}