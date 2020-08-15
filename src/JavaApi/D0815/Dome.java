package JavaApi.D0815;

import Util.sql.DBHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author 12613
 */
public class Dome {
    /**
     * 分页查询
     */
    @Test
    public void testPage(){
        String sq1 = "select * from emp";
        DBHelper dbHelper = new DBHelper();
        List<Map<String,Object>> page =dbHelper.queryPage(sq1,1,5);
        for (Map<String,Object> m : page){
            System.out.println(m);
        }
        Assert.assertEquals(5,page.size());
        Assert.assertEquals("蔡徐坤",page.get(0).get("ENAME"));
    }
}
