package JavaApi.D0805;

public class Dome {
    public static void main(String[] args) {

            a();

    }

    public static void a() {
        try {
            System.out.println("===a===");
            int[] a = {1, 2, 3};
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);
            //数据越界
            System.out.println(a[6]);
            System.out.println("===a2===");
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println("访问元素不存在");
        }
    }

    public static void b() {
        System.out.println("===b===");
        //除0异常
        int a = 1 / 0;
    }

    public static void c(Object obj) {
        System.out.println("===c===");
        System.out.println(obj);
//输出obj对象哈希码这里会出现大名鼎鼎的空指针异常
        System.out.println(obj.hashCode());
    }

}
