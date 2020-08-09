package JavaApi.D0807.Homework;

import javafx.animation.KeyFrame;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateDome {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        System.out.println("现在时间：" + sdf.format(date)); // 输出已经格式化的现在时间（24小时制）

        Date now = new Date();
        long time = now.getTime();//获取1970.1.1到现在的毫秒值:时间戳
        time -= 60 / 1000; // 获取1分钟前的时间戳
        Date d1 = new Date(time);//
        System.out.println(d1);

        d1.setTime(time - 60 * 60 * 1000);
        System.out.println(d1);
        System.out.println("++++++++++++++++++++++++++++++++++++");
//日期类型有很多方法已经被废弃
        // d1.getHoure();
//如果要获取时间的值，必须使用calender 类(日历)
//        日历类支持:
// 1,日期字段的获职(年月日)
// 2,日期的运算
//        日历对象的创建,使用一个工厂方法(静态方法)获取对象,工厂方法是-种设计模式
        Calendar cal = Calendar.getInstance(); // 获取当前时间的日历对象
        System.out.println(cal.get(Calendar.DATE)); //该月的日期
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); //本月的日期
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));// 年度的日数
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));// 周中的日期
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //当天的小时数

        //日历转日期Date ==> getTime
        System.out.println(cal.getTime()); // 打印当前时间
        cal.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(cal.getTime()); // 打印加了一 -天后的时间


    }
}