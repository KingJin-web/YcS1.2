package JavaApi.D0807;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * Arrays 数组工具类
 *
 * @author 12613
 */
public class Dome2 {
    public static void main(String[] args) {
        //a();
        b();
    }

    private static void b() {
        Random rd1 = new Random(10);
        System.out.println(rd1.nextInt());
        System.out.println(rd1.nextInt());
        System.out.println(rd1.nextInt());
        System.out.println(rd1.nextInt());
        System.out.println(rd1.nextInt());
        //0~99 随机
        System.out.println(rd1.nextInt(100));
        System.out.println(rd1.nextInt(100));
        System.out.println(rd1.nextInt(100));
        System.out.println(rd1.nextInt(100));
        System.out.println(rd1.nextInt(100));

        Random rd2 = new Random(10);
        System.out.println(rd2.nextInt());
        System.out.println(rd2.nextInt());
        System.out.println(rd2.nextInt());
        System.out.println(rd2.nextInt());
        System.out.println(rd2.nextInt());
        //0~99 随机
        System.out.println(rd2.nextInt(100));
        System.out.println(rd2.nextInt(100));
        System.out.println(rd2.nextInt(100));
        System.out.println(rd2.nextInt(100));
        System.out.println(rd2.nextInt(100));


    }

    private static void a() {
        int[] arr = {11, 3, 45, 69, 26, 44, 1, 10, 26, 0};
        System.out.println(arr);
        System.out.println("44在" + Arrays.binarySearch(arr, 44));
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("44在" + Arrays.binarySearch(arr, 44));
        //binarySearch 必须查找排序后了的 半分法


        Person[] arr2 = {
                new Person("蔡徐坤", 18),
                new Person("鹿晗", 21),
                new Person("乔碧萝", 20),
                new Person("潘金莲", 19)
        };
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}

class Person {
    String name;
    int age;


    public int compareTo(Person o) {
        return this.age - o.age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}