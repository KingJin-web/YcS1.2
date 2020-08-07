package JavaApi.D0807;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dome {
    public static void main(String[] args) {
        b();
    }

    public static void a() {
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date(2020 - 1900, 7, 7);
        System.out.println(d2);

        Date d3 = new Date(120455454);
        System.out.println(d3);

        System.out.println(d3.getTime());
        System.out.println(d1.getTime());

        d1.setTime(d1.getTime() - 1000 * 60 * 60 * 24 * 30);
        System.out.println(d1);
    }

    public static void b() {
        System.out.println("==== Calendar ====");
        Calendar c = Calendar.getInstance();

        Date d4 = c.getTime();
        long time = d4.getTime();
        System.out.println(d4);
        System.out.println(time);

        System.out.println("==== add and roll ====");
        System.out.println(new Date());
        c.setTime(new Date());
        c.add(Calendar.DAY_OF_MONTH, 30);
        System.out.println(c.getTime());

        c.setTime(new Date());
        c.roll(Calendar.DAY_OF_MONTH, 30);
        System.out.println(c.getTime());

        c.set(Calendar.MONTH, 11);
        System.out.println(c.getTime());
        //SimpleDateFormat
        // 代码格式化工具 在java.text
        /**
         * 构建需要掩码
         * y 表示年
         * M 表示月
         * d 表示天
         * H 24小时制的小时
         * h 12小时制的小时
         * m 分钟
         * s 秒
         */
        Date d1 = new Date();
        String mask = "yyyy年MM月dd日HH时mm分ss秒";
        SimpleDateFormat sdf = new SimpleDateFormat(mask);
        String dateS = sdf.format(d1.getTime());
        System.out.println(dateS);

        try {
            Date d5 = sdf.parse("2020年12月09日06时55分55秒");
            System.out.println(d5);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
