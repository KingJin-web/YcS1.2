package JavaApi.D0814;

import Util.sql.DBHelper;

import java.util.List;
import java.util.Map;

public class Dome {


    public static void main(String[] args) {
        DBHelper dbHelper = new DBHelper();
        //dbHelper.update("insert into dept values(?,?,?)",2,"唱跳","北京");

        List<Map<String,Object>> list1 = dbHelper.query("select * from emp");
        for (Map<String,Object> map : list1){
            System.out.println(map);
        }
//list = dbh.se1ect("select * from emp where sal > ?"，1000) ;
        List<Map<String,Object>> list2 = dbHelper.query("select * from emp where sal > ?",1000);
        for (Map<String,Object> map : list2){
            System.out.println(map);
        }
        List<Map<String,Object>> list3 = dbHelper.query("select * from emp");
        for (Map<String,Object> map : list3){
            System.out.println(map);
        }
    }

}
