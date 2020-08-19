package JavaApi.D0815.Homework;

import Util.sql.DBHelper;

public class Dome {

    /**
     * 作业: 请参考存款的方法,实现 转账业务
     * 	1. 将 A 账户的资金转入B转换   (基本功能)
     * 	2. 实现校验, 转出的金额不能大于 A 账户的金额, 如何判断?
     */

    public void testTransfer() {
        String sql1 = "update bank_account set balance = balance + ? where id = ?";
        String sql2 = "insert into bank_oprecord values ( bank_seq.nextval, ? , ? , sysdate)";
        DBHelper dbh = null;
        try {

            dbh = new DBHelper();

            String sql = "select * from where id=? and balnace>=?";
            if( dbh.count(sql, 1, 1000) == 0) {
                System.out.println("金额不足");
                return;
            }
            if (dbh.update(sql1, - 1000, 1) == 1) {
                dbh.update(sql2, 1, - 1000);
                if (dbh.update(sql1, 1000, 2) == 1) {
                    dbh.update(sql2, 2, 1000);
                }
            }
            // 正常情况下要提交
            dbh.commit();
        } catch (Exception e) {
            e.printStackTrace();
            // 异常情况下要回滚
            assert dbh != null;
            dbh.rollback();
        } finally {
            assert dbh != null;
            dbh.close();
        }
    }
}
