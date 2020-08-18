package JavaApi.D0813.Homework;

import Util.io.IOHelper;

import java.sql.*;
import java.util.*;

public class EmpDao {
    private Connection conn;
    private boolean isAutoCommit = true;

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            RuntimeException re = new RuntimeException("数据库驱动加载失败!", e);
            throw re;
        }
    }

    public EmpDao() {

    }




    // 返回连接对象
    public Connection getConn() {
        return conn;
    }

    /**
     * 使用 isAutoCommit 决定是否自动提交
     * <p>
     * 如果是自动提交, 则意味着每次执行 update 方法都要获取新的连接, 在执行之后关闭连接
     * 否则, 不关闭连接
     *
     * @param isAutoCommit 自动提交  true
     */
    public EmpDao(boolean isAutoCommit) {
        this.isAutoCommit = isAutoCommit;
        if (!isAutoCommit) {
            conn = openConnection();
        }
    }

    /**
     * 获取连接
     *
     * @return
     */
    public Connection openConnection() {


        //String url = "jdbc:oracle:thin:@39.107.46.233:1521:orcl"; // 数据库的地址
        String url = "jdbc:oracle:thin:@39.101.201.188:1521:orcl";
        String user = "scott";
        // 数据的用户
        String password = "a";
        try {
            if (isAutoCommit) {
                return DriverManager.getConnection(url, user, password);
            } else {
                if (conn == null) {
                    // 禁止自动提交
                    conn = DriverManager.getConnection(url, user, password);
                    conn.setAutoCommit(isAutoCommit);
                }
                return conn;
            }
        } catch (SQLException e) {
            throw new RuntimeException("获取数据库连接失败!", e);
        }
    }

    public ArrayList<Emp> inquiry(String sql, Object... params) throws SQLException {
        ArrayList<Emp> ret = new ArrayList<>();
        try {
            conn = openConnection();
            System.out.println("SQL: " + sql);
            PreparedStatement ps = conn.prepareStatement(sql);

            System.out.println("参数: " + Arrays.toString(params));
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            ResultSet rs = ps.executeQuery();





            while (rs.next()) {
                Emp emp = new Emp();
                emp.setEmpno(rs.getInt("Empno"));
                emp.setEname(rs.getString("Ename"));
                emp.setJob(rs.getString("Job"));
                emp.setMgr(rs.getInt("Mgr"));
                emp.setHiredate(rs.getDate("Hiredate"));
                emp.setSal(rs.getInt("Sal"));
                emp.setComm(rs.getInt("Comm"));
                ret.add(emp);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            IOHelper.close(conn);

        }
        return ret;
    }

    /**
     * 执行修改数据库的语句
     * sql = "update emp set ename = ? where empno=?"
     * update(sql,2,3,)
     *
     * @param sql    执行的sql语句
     * @param params 可变参数数组
     * @return
     */
    public int update(String sql, Object... params) {
        try {
            // 每次都会通过open方法获取连接
            conn = openConnection();
            System.out.println("SQL: " + sql);
            PreparedStatement ps = conn.prepareStatement(sql);
            // alrt + /
            System.out.println("参数: " + Arrays.toString(params));
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("执行SQL语句失败!", e);
        } finally {
            if (isAutoCommit) {
                IOHelper.close(conn);
            }
        }
    }


}
