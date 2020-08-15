package JavaApi.D0814.Homework;

import Util.sql.DBHelper;

import java.util.Collection;
import java.util.Map;

public class Dome {
    public int count(String sql,Object ...param){
        DBHelper dbHelper = new DBHelper();
        return dbHelper.query(sql,param).size();
    }

    public Object getValue(String sql,Object ...param){
        DBHelper dbHelper = new DBHelper();
        Map<String,Object> row = dbHelper.query(sql,param).get(0);
        Collection<Object> values = row.values();
        return values.iterator().next();
    }
}
