package JavaApi.D0807.Homework;

public class ClassDemo {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException,
            NoSuchFieldException,InstantiationException,IllegalAccessException{

//        获取类对象的方法
//        1,使用class关键字
//        2, Class. forName ("类完全限定名静态方法
//                类完全限定名包名+英名
//        3.使用getClass对象成员方法

        System.out.println(A.class);

        try{
            System.out.println(Class.forName("D0229.A"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Object o = new A();
        System.out.println(o.getClass());

//        类的构成元素方法,属性，构造方法，块,内部卖
//                * 类对象可以动态的获取这些元素对蒙
//        Unhandled exception type NoSuchMethodException
        Class cls =o.getClass();
        System.out.println(cls.getMethod ("hashCode")); //1 获取方法对象
            //异常如果不try catch 那么就继续扔出去	中
        System. out. println(cls.getField("name"));// 1 获取属性对蒙	..
        A aa = (A) cls.newInstance(); //创建对象 -==> new A();
        System.out.println(aa);
        System.out.println(o);
    }
}
class A{

    public String name;
}