package JavaApi.D0814.Homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class DomeTest {

    @Test
    public void count() {
        String sq1 = "select * from emp";
        Dome dome =new Dome();
        System.out.println(dome.count(sq1));

    }

    @Test
    public void getValue() {
        String sq1 = "select max(sal) from emp";
        Dome dome =new Dome();
        System.out.println(dome.getValue(sq1));
    }
}