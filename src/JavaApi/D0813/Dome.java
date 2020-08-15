package JavaApi.D0813;

import Util.io.IOHelper;
import Util.sql.DBHelper;

import java.sql.*;

public class Dome {


    //
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // main.updateDept();
        selectBysal();
    }

    public void updateDept() throws ClassNotFoundException, SQLException {
        //1 加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //2.获取连接

        String url = "jdbc:oracle:thin:@localhost:1521:orc";
        String user = "scott";
        String password = "a";
        Connection conn = DriverManager.getConnection(url, user, password);

        //3.创建语句
        Statement stat = conn.createStatement();
        //4.执行语句
        String sql = "update dept set dname='财务部' where deptno=10";
        int ret = stat.executeUpdate(sql);
        System.out.println(ret);
        stat.close();
        conn.close();
        System.out.println(conn);
    }

    public static void selectBysal() {

        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.获取连接
            String url = "jdbc:oracle:thin:@39.101.201.188:1521:orcl";
            String user = "scott";
            String password = "a";
            conn = DriverManager.getConnection(url, user, password);
            stat = conn.createStatement();
            String sql = "select * from  emp where sal > 1000";
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                int empno = rs.getInt(1);
                String empty = rs.getString(2);
                String job = rs.getString("JOB");
                double sal = rs.getDouble("SAL");
                // System.out.println(empno +" " + empty +" " +job + " " + sal);

                System.out.printf("%s\t%s\t%s\t%s\n", empno, empty, job, sal);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            IOHelper.close(stat, conn, rs);
        }


    }

    public static void selectBysal(String name) {
        PreparedStatement ps = null;
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.获取连接
            String url = "jdbc:oracle:thin:@39.101.201.188:1521:orcl";
            String user = "scott";
            String password = "a";
            conn = DriverManager.getConnection(url, user, password);
            stat = conn.createStatement();
            String sql = "select * from  dept where dname = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);

            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(" " + rs.getInt(1));
                System.out.println(" " + rs.getInt(2));
                System.out.println(" " + rs.getInt(2));
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            IOHelper.close(stat, conn, rs);
        }

    }
}
