## Java语法基础

#### JavaOOP

##### 1.封装
	类的构成：
		1.属性
		2.方法（行为）
		3.构造方法
			方法名与类名一致
			没有返回值
			class A{
				A(){
				}
			}
		4.块	
			class A{
				{  // 实例块
					// 没有名字的构造函数
				}
				static{ //静态块
					// 类加载时一定会执行一次
					// JDBC DBHelper 加载驱动
				}
			}
		5. 内部类
#####2. 继承
	从一个类派生出另一个类的过程，解决代码重用
	构造函数的继承特性：
		1.构造函数不能被继承，只能被重写
		2.子类的构造函数默认会调用父类的构造函数
		
#####3. 多态
	A 类 父类
	B 类 子类
	class B extends A {}
	
	A a = new A();
	B b = new B();
	
	A a = new B();  // 父类引用子类对象 ==》 引用转型
	B b = new A();  // 错误
	
	如果要求子类必须实现某些方法 ==》 抽象类
	
	class abstract A { // 抽象类
		abstract void test(); // 抽象方法
		void play(){
			// 非抽象方法
		}
	}
	抽象类不能直接创建对象  ==》 new A()； 错误
	class B extends A {
		void test(){
			// B 非抽象类， 那么 test 必须要实现
		}
	}
	
	接口：全部是抽象方法
	interface C {
		// 只能定义抽象方法
	}

####Java API
	java.lang ==> 语法基础包，不需要导入，直接里面的类
		String
		包装类： 8个
		Match： 数学计算
		
		Throwable 可以被抛出的类
		Error 错误，   Exception 异常
				编译器异常		运行期异常：RuntimeException
							
	java.uitl 工具包
		集合：对数组的升级
		单列集合：每一个元素就是一个值
		List：有序可重复
			get（下标，索引）
		Set： 无序不重复
		双列集合： 由键（名字）值（元素）对构成一个元素
		Map： 无序不重复，每个元素有个唯一的名字
		
		日期： Date 日期， Calendar 日历
		
	java.io 包
		方向分：
			输入流：Input ， Writer
			输出流：Output， Reader
		数据格式：
			字节流：Stream
			字符流：Writer， Reader
		处理资源：
			资源流：构造方法传入被处理的资源（文件，字符串）
			处理流：构造方法传入另一个流
			
		File： 用于表示一个文件或目录
		
		
		
		
		
		
		
		
	
在一个有序数据集合中，经常需要对数据进行插入和删除的操作(不考虑线程安全)，请问使用哪个数据结构最合适
 
 	
A.
ArrayList ：数组（内存中连续的存储区域（查询块），大小固定（写入慢））
B.
LinkedList：链表（查询慢，写入快）
C.
Vector	  ： 矢量集合（等效于ArrayList） 多线程安全
D.
HashMap	  ： 键值对，无序不重复
	
	
JDBC 操作5步骤
1. 加载驱动
		Class.forName("驱动的类路径，com.oarcle...");
		类似 import 驱动类
2. 获取连接
		Connection conn = DriverManager.getConnection(url,user,pwd);
3. 创建语句
		createStatement() // 创建普通语句对象
		PreparedStatment ps = conn.prepareStatment("sql语句")
		// 预编译：在java程序中完成编译过程
		优势： 快， 安全（避免注入攻击）
4. 执行语句
		ps.executeQuery() ==> 执行查询
			ResultSet 结果集对象
		ps.executeUpdate() ==> 执行除查询以外所有的sql用于
5. 关闭连接
	结果集，语句，连接，都可以关闭
	conn.close();
		
			
		
		











