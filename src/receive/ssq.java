package receive;

import JavaApi.D0813.Homework.Emp;
import Util.io.IOHelper;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class ssq {

    private static final List<String> ssqdate = new ArrayList<>();
    private static final String ssqfile = "H:\\jetbrains\\java\\YcS1.2\\src\\receive\\双色球.txt"; // 文件路径
    FileReader fr = null;
    BufferedReader br = null;
    Connection conn = null;

    public void read() {
        try {

            fr = new FileReader(ssqfile);
            br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null && line.length() != 0) {
                ssqdate.add(line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void save() {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@39.101.201.188:1521:orcl";
            String user = "scott";
            // 数据的用户
            String password = "a";

            conn = DriverManager.getConnection(url, user, password);

            String sql = "insert into lottery values(seqSqq.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            for (String line : ssqdate) {
                String[] values = line.split("\\s+");
                for (int i = 1; i <= 12; i++) {
                    ps.setString(i, values[i - 1]);
                }
                ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }

    public List<Map<String, Object>> query(String sql) {
        List<Map<String, Object>> ret = new ArrayList<>();
        try {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            String url = "jdbc:oracle:thin:@39.101.201.188:1521:orcl";
            String user = "scott";
            String password = "a";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("SQL: " + sql);
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()) {
                Map<String, Object> row = new LinkedHashMap<>();
                // 获取每一个字段值, 设置到一个map中
                for (int i = 0; i < rsmd.getColumnCount(); i++) {
                    String columnName = rsmd.getColumnName(i + 1);
                    Object columnValue = rs.getObject(columnName);
                    //System.out.println(columnName + columnValue);
                    row.put(columnName, columnValue);
                }
                ret.add(row);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        ssq s = new ssq();
        //s.read();
//        s.save();
//        for (String line : ssqdate){
//            System.out.println(line);
//        }
        List<Map<String, Object>> list = s.query("select * from lottery");
       //System.out.println(list.size());
        //System.out.println(list);
        for (Map<String, Object> line: list) {
            System.out.println(line);
        }
    }

}
