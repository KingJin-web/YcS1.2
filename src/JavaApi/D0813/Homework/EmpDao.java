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

    public void closeConnection() {
        IOHelper.close(conn);
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

    public List<Map<String, Object>> inquiry(String sql, Object... params) throws SQLException {
        List<Map<String, Object>> ret = new ArrayList<>();
        try {
            conn = openConnection();
            System.out.println("SQL: " + sql);
            PreparedStatement ps = conn.prepareStatement(sql);
            // alrt + /
            System.out.println("参数: " + Arrays.toString(params));
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            ResultSet rs = ps.executeQuery();

            // 获取结果集元数据对象, 元(Meta)数据(data): 描述数据的数据
            ResultSetMetaData rsmd = rs.getMetaData();
            // 创建返回结果对象
            Map<String, Object> row = new LinkedHashMap<>();
            Emp emp = new Emp();

            while (rs.next()) {
                emp.setEmpno(rs.getInt(1));
                emp.setEname(rs.getString(2));
                emp.setJob(rs.getString(3));
                emp.setMgr(rs.getInt(4));
                emp.setHiredate(rs.getDate(5));
                emp.setSal(rs.getInt(6));
                emp.setComm(rs.getInt(7));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            IOHelper.close(conn);
        }
        return ret;
    }

}
