package JavaApi.D0813.Homework;




import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmpDaoTest  {


    private static final EmpDao empDao = new EmpDao();
    /**
     * 查询
     * @throws SQLException
     */
    @Test
    void inquiry() throws SQLException {

        ArrayList<Emp> list = empDao.inquiry("select * from emp");
        for (Emp emp : list) {
            System.out.println(emp);
        }

    }


    @Test
    public void update() throws SQLException {
        empDao.update("update emp set ename = ? where empno=?","蔡徐坤1",9528);
        System.out.println("修改ok");

    }

    /**
     * delete from 表名 where 条件
     */
    @Test
    public void update1() {
        empDao.update("delete from emp where empno=?",9528);
        System.out.println("删除ok");
    }

    /**
     *INSERT INTO "SCOTT"."EMP" VALUES ('9527', '蔡徐坤', '唱歌', '9541',
     * TO_DATE('2020-08-06 16:15:06', 'SYYYY-MM-DD HH24:MI:SS'), '135', '99', NULL);
     */
    @Test
    public void update2() {

        empDao.update("INSERT INTO EMP VALUES ('9527', '蔡徐坤', '唱歌', '9541',\n" +
                "TO_DATE('2020-08-06 16:15:06', 'SYYYY-MM-DD HH24:MI:SS'), '135', '99', NULL)");
        System.out.println("删除ok");
    }



}
class test{

    public static void main(String[] args) throws SQLException {
        EmpDao empDao = new EmpDao();
        empDao.update("update emp set ename = ? where empno=?","蔡徐坤1",9528);
        EmpDaoTest e = new EmpDaoTest();
        e.inquiry();
    }
}