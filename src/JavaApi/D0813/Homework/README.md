JDBC ==> Java 数据库 连接组件

JDBC: 是用于连接和操作数据库的一系列的类和接口的集合的统称

java.sql 包 就是jdbc 的包

JDBC 是java企业版的13个规范之一

使用JDBC的5个步骤
1. 加载驱动
	1) 将驱动 jar 包导入工程
	2) Class.forName("oracle.jdbc.driver.OracleDriver");
2. 获取连接
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String user="scott";
	String password="a";
	Connection conn = DriverManager.getConnection(url, user, password);
3. 创建语句
	ps = conn.prepareStatement(sql);
4. 执行语句
	executeUpdate  	除了查询以外所有的语句
	executeQuery	查询
5. 关闭连接
	结果集, 语句, 连接 都可以关闭
	关闭顺序:  结果集==>语句==>连接
	可以直接关闭上游资源, 那么下游资源也会同时关闭

预编译语句对象:
	1. 是普通语句对象的子类
	2.创建语句对象时传入SQL, 执行时不传
	3.优势:
		1) 效率高
		2)安全性高

案例
1.向scott数据库的dept添加一个部门"事业部" (  insert , update, delete ...)

2.根据 id 查询某个部门 , 并将结果打印在控制台上

3.根据 dname 查询部门,  , 并将结果打印在控制台上


作业:
	1. 默写 showDeptByName 方法
	2.完成练习题目: JDBC基础练习
	3.实现多 emp 的增删改查(  hiredate 日期类型用  java.sql.Date, 或不写值 )





