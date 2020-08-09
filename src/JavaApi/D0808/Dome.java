package JavaApi.D0808;

import java.util.*;

/**
 * 大虚线框 ==> 抽象类
 * 小虚线框 ==> 接口
 * 实线箭头 ==> 继承
 * 实线箭头 ==> 继承 或 实现
 * 虚线箭头 ==> 接口继承
 * 虚线黑箭头 ==> 关联
 * 类图 ==> UML
 * UML ==> 统一建模语言
 *
 * @author 12613
 */
public class Dome {
    public static void main(String[] args) {
        a();
        b();
    }

    private static void b() {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        set.add("C");
        set.add("A");

        for (String a : set){
            System.out.println(a);
        }

        System.out.println(set);

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (Iterator<String> it1 = set.iterator();it1.hasNext();){
            System.out.println(it1.next());
        }
    }

    private static void a() {
//        List<Object> list = new ArrayList<>();
//        List list = new LinkedList();
        List<Object> list = new Vector<>();
//        List<Object> list = new ArrayList<>();
//        List<Object> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(10);

        System.out.println(list);
        list.add(1, 8);
        System.out.println(list);

        list.remove(Integer.valueOf(10));

        System.out.println(list.indexOf(8));

        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());
    }
}
