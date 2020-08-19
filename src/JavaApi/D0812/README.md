2	 包装类（Wrapper）有哪些?常用...	2.44
8种基本数据类型都有包装类
char => Charactor
int  => Integer
valueOf ==> 包装对象  	静态
parseXXX==> 基本数据值    静态
MAX_VALUE
MIN_VALUE


3	 什么是序列化/反序列化?如何实现?...	2.22
序列化: 将对象转成字节流的过程
反序列化: 将字节流转成对象的过程
实现: 就是给类添加一个 序列化接口, ==> 标志接口(没有任何方法)
class A implements java.io.Serializable
实现序列化接口之后, 必须提供序列化版本编号, 1L 默认值
private static final long serialVersionUID = 1L;


4	 字符流特点是什么?...	2.83
27	 字节流的特点是什么?...	2.72
	传输的数据的格式是以字节为单位的数据 ==> 字节流  jpg, MP3, avi ...
	传输的数据的格式是以字符为单位的数据 ==> 字符流  txt, html, css, ini ...


5	 Collections类中常用发方法...	2.66
	java.util.Arrays 数组工具类(排序, 查找, 填充)
	java.util.Collections 集合工具类(排序, 查找, 填充, 反序)

================================================================


8	 常用的字节流、字符流、对象流、数据流...	2.55
28	 流根据方向的不同，可以分为哪几类?根...	2.61

	流的命名规则: 资源+方向+格式
	FileInputStream, FileOutputStream
	BufferedInputStream  缓冲输入字节流
	BufferedReader		 缓冲输入字符流
	ObjectInputStream	对象输出字节流
	InputStreamReader	字节输入流转字符输入流
	OutputStreamWriter	字节输出流转字符输出流
	...


11	 Set集合的特点是什么?常用的子类有...	2.83
	无序不重复( 没有 get 方法 ==> List 有序  get(下标))
	HashSet, LinkedHashSet(有序), TreeSet(排序, 存入的元素要实现Comparable)


10	 Map集合的特点是什么?常用的子类有...	2.66
	给set集合中的每个元素起个名字 ==> Map
	HashMap(不安全,快,新),Hashtable(安全,慢,旧),   LinkedHashMap(有序), TreeMap(排序),
	Properties(存字符串数据, 可以保存为文件)

13	 Math类中向上取整、向下取整、四舍...	2.66
	Match.round() 四舍五入
	Math.floor()  向上取整
	Math.ceil()	  向下取整

23	 什么是自动装箱/自动拆箱?...	2.88
	字节将基本数类型字面值 赋值给 包装器对象  ==> 装箱
	Integer a = 100;  int ==> Integer
	字节将包装器对象 赋值给 基本数据类型的变量  ==> 拆箱
	int b = a;        Integer ==> int

================================================================

12	 throw和throws的区别是什么...	2.44
25	 如何异常抛出一个异常?...	2.83
22	 异常的继承结构...	2.77

	Throwable   					异常和错误的父类
		Error						错误
		Exception					异常
			RuntimeException		运行期异常
				继承于RuntimeException运行期异常
			其他的非RuntimeException	编译期异常
			继承于Exception			编译期异常

	try{
		try{
			int i = 1/0;
		}catch(Exceptin e){
			throw e
		}
	} 
	
	异常的处理方式:
	1. 现场处理
	2. 抛出给其他代码处理
	
	运行期异常, 不强制要求捕获	==> 不具感知性
	编译期异常, 强制要求捕获	==> 具有感知性
	
	自定义一个异常

	throw 是抛出异常
	throws 是对方法可能抛出的异常, 进行的声明

26	 异常产生的原因有哪些?异常的种类有哪...	2.72
	1. 错误的操作: 1/0, 越界访问 ...
	2. 自己抛出异常, 原因是业务逻辑问题, 密码输错, 性别填错 ...

=======================================================

16	 字符串类String、StringB...	2.83
	内容不变的对象
		String
			可以直接使用 + 连接字符串
	内容可变的对象
		StringBuffer	(线程安全,  效率低)
		StringBuilder	(线程不安全, 效率高)
			使用对象方法 append 连接
			sb => 123
			sb.append("abc"); // 123abc

20	 List集合的特点是什么?常用的子类...	2.50
	有序可重复
	ArrayList(数组实现, 不安全,   查快插慢),
	Vector(数组实现, 安全) ,  
	LinkedList(链表实现		    查慢插快)


21	 File类的作用是什么?如何创建文件...	2.72
	File 用于表示一个文件或目录
	createNewFile()		创建文件
	mkdir() or mkdirs()	创建目录
	lists() listFiles	查询目录中的文件,数组返回
	delete()			删除
	lastModifies()		最后修改时间, 返回时间戳(毫秒值)


24	 如何迭代器迭代输出集合中的数据?...	2.50
	List list;
	Iterator it = list.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
