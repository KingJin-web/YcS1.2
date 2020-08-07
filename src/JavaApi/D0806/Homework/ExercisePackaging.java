package JavaApi.D0806.Homework;

/**
 * 常用 Integer 方法汇总练习
 * 请根据每行注释的描述，执行指定的方法，并输出结果
 * 
 * 请参考API: http://www.matools.com/api/java8
 */
public class ExercisePackaging {
	
	/**
	 * Integer 类练习
	 * 注意：
	 * 		其他数值类型的包装类（Long、Double...）也具有相同或类似方法，
	 * 		请童鞋们自行验证。
	 */
	public static void main(String[] args) {
		//testInteger();
		//testCharacter();
		testBoolean();

	}

	public static void testInteger() {
		
		/**
		 * 构造方法
		 */
		// 请使用 int值 99 作为参数，创建一个 Integer 变量 number1 
		Integer number1 =new Integer(99);
		System.out.println(number1);
		// 请使用 字符串 "88" 作为参数，创建一个 Integer 变量 number2
		Integer number2 = new Integer("88");
		System.out.println(number2);

		Integer a = 1;
		int b = a;
		/**
		 * 实例方法（对象方法）
		 */
		Integer var = 100;
		System.out.println("测试对象 var = " + var);
		// 执行 ???Value(int i) 方法将 i 转换成 byte 类型
		byte v1 = var.byteValue();
		System.out.print("byte："+v1);
		// 执行 ???Value(int i) 方法将 i 转换成 short 类型
		short v2 = var.shortValue();
		System.out.print(" short："+v2);
		// 执行 ???Value(int i) 方法将 i 转换成 int 类型
		int v3 = var.intValue();
		System.out.println(" int："+v3);
		// 执行 ???Value(int i) 方法将 i 转换成 long 类型
		long v4 = var.longValue();
		System.out.print("long："+v4);
		// 执行 ???Value(int i) 方法将 i 转换成 float 类型
		float v5 = var.floatValue();
		System.out.print(" float："+ v5);
		// 执行 ???Value(int i) 方法将 i 转换成 double 类型
		double v7 = var.doubleValue();
		System.out.println(" double："+v7);
		// 执行 ???To(Integer anotherInteger) 数字比较两个 Integer对象
		Integer x = 5;
		Integer y = 15;
		System.out.print(x.compareTo(y)+" "); //输出-1
		x = 15;
		System.out.print(x.compareTo(y)); //输出0
		x = 20;
		System.out.println(x.compareTo(y)); //输出1

		/**
		 * 静态属性和方法
		 */
		System.out.println("======================================");
		// 请输出 Integer 类型的最大值   Integer.MAX_VALUE和Integer.MIN_VALUE
		System.out.println(" Integer 类型的最大值 最小值 ");
		System.out.println(Integer.MAX_VALUE);
		// 请输出 Integer 类型的最小值
		System.out.println(Integer.MIN_VALUE);
		// 执行 ???Int(String s)，将字符串参数解析为带符号的十进制整数
		String m = "123456789", n = "-987654321";

		System.out.println(Integer.parseInt(m)+" "+Integer.parseInt(n));
		// 执行 ???(int x, int y)，数字比较两个 Integer对象
		System.out.println(Integer.compareUnsigned(12,36));
		// 执行 ???(int a, int b)，返回两个 int的较大值
		System.out.println(Integer.max(12,36));
		// 执行 ???(int a, int b)，返回两个 int的较小值
		System.out.println(Integer.min(12,36));
		// 执行 ???(int a, int b)，根据+运算符将两个整数相加
		System.out.println(Integer.sum(1300,14));
		// 执行 to???String(int i)，在基数2中返回整数参数的字符串表示形式为无符号整数（转成2进制）
		System.out.println("2进制: "+Integer.toBinaryString(123));
		// 执行 to???String(int i)，返回整数参数的字符串表示形式，作为16位中的无符号整数（转成16进制）
		System.out.println("16进制: "+Integer.toHexString(123));
		// 执行 to???String(int i)，在基数8中返回整数参数的字符串表示形式为无符号整数（转成8进制）
		System.out.println("8进制: "+Integer.toOctalString(123));
		// 执行 ???Of(int i)，返回一个 Integer指定的 int值的 Integer实例（int 转 Integer）
		int al = 123;
		Integer a2 =Integer.valueOf(al);
		System.out.println("int: " + al +" Integer: " + a2);
		// 执行 ???Of(String s)，返回一个 Integer对象，保存指定的值为 String（String 转 Integer）
		String s1 = "987654321";
		Integer s2 =Integer.valueOf(s1);
		System.out.println("String: " + s1 +" Integer: " + s2);
	}
	
	/**
	 * Character 练习
	 */
	public static void testCharacter() {
		/**
		 * 构造方法
		 */
		// 请用构造方法创建一个 Character 对象
		Character c = new Character('1');
		System.out.println(c);
		/**
		 * 静态属性
		 */
		 // 请输出 char 的最大值
		System.out.println(Character.MAX_RADIX);
		 // 请输出 char 的最小值
		System.out.println(Character.MIN_RADIX);
		/**
		 * 实例方法
		 */
		// 执行 ???Value() 返回此 Character对象的值
		Character a = new Character('a');
		System.out.println(a);
		// 执行 ???To(Character anotherCharacter) 数字比较两个 Character对象。
		Character b = new Character('b');
		System.out.println(a.compareTo(b));

		/**
		 * 静态方法
		 */
		// 执行 is???(char ch) 确定指定的字符是否是数字
		System.out.print("是数字 " + Character.isDigit('9') );
		System.out.println("  不是数字 " + Character.isDigit('n') );
		// 执行 is???(char ch) 确定指定的字符是否是一个字母。
		System.out.print("是字母" + Character.isLetter('a'));
		System.out.println("  不是字母" + Character.isLetter('9'));
		// 执行 is???(char ch) 确定指定的字符是否是小写字符。

		System.out.print("是小写字符 " + Character.isLowerCase('a'));
		System.out.println("  不是小写字符 " + Character.isLowerCase('A'));
		// 执行 is???(char ch) 确定指定的字符是否为大写字符。
		System.out.print("是大写字符 " + Character.isUpperCase('A'));
		System.out.println("  不是大写字符 " + Character.isUpperCase('a'));
		// 执行 is???(char ch) 确定指定的字符是否是Unicode空格字符。
		System.out.print("空格：" + Character.isWhitespace(' '));
		System.out.println("非空格：" + Character.isWhitespace('8'));
		// 执行 to???(char ch) 使用UnicodeData文件中的案例映射信息将字符参数转换为大写。
		System.out.println(Character.toUpperCase('a'));
		// 执行 to???(char ch) 使用UnicodeData文件中的大小写映射信息将字符参数转换为小写。
		System.out.println(Character.toLowerCase('A'));
		// 执行 ???Of(char c)  返回一个 表示指定的 char值的 Character实例。
	}
	
	/**
	 * Boolean 练习
	 */
	public static void testBoolean() {
		/**
		 * 构造方法
		 */
		// 使用 boolean值 创建 Boolean对象
		Boolean b = new Boolean(true);
		System.out.println(b);
		// 使用 String值 创建 Boolean对象
		String s="false";
		Boolean b1=new Boolean(s);
		System.out.println(b1);
		/**
		 * 静态属性
		 */
		// 请在控制台输出 Boolean对象对应于原始值 false 。
		System.out.println(Boolean.FALSE);
		// 请在控制台输出 Boolean对象对应于原始值 true 。
		System.out.println(Boolean.TRUE);
		/**
		 * 实例方法
		 */
		// 执行 ???Value() 将此 Boolean对象的值作为布尔基元返回。
		Boolean bool = new Boolean("true");  //定义一个Boolean型数据
		System.out.println(bool.booleanValue());
		// 执行 ???To(Boolean b) 将此 Boolean实例与另一个实例进行比较。
		System.out.println(bool.compareTo(false));
//		Boolean.valueOf(x).compareTo(Boolean.valueOf(y)) 参数
//		x - 第一个 boolean进行比较
//		y - 第二个 boolean进行比较
//				结果
//		价值0如果x == y ; 一个值小于0如果!x && y ; 并且如果x && !y大于0的值
//		从以下版本开始：
//		1.7

		/**
		 * 静态方法
		 */
		// 执行 ???(boolean x, boolean y) 比较两个 boolean值。
		//System.out.printf("执行 ???(boolean x, boolean y) ：");
		System.out.println(Boolean.compare(true,false));
		// 执行 get???(String name) 返回 true当且仅当由参数命名的系统属性存在且等于字符串 "true" 。
		//System.out.printf("执行 get???(String name)：");
		System.out.println(Boolean.getBoolean("true"));  //这样输出为false
		//https://blog.csdn.net/u010887744/article/details/52410665
 		//https://www.cnblogs.com/coderland/p/5963035.html
		String systemProperty = "true";
		System.setProperty("key", systemProperty); // key-value https://www.cnblogs.com/daijiabao/p/11183277.html
		System.out.println(Boolean.getBoolean("key"));


		// 执行 logical???(boolean a, boolean b) 返回将逻辑AND运算符应用于指定的 boolean操作数的结果。
		//System.out.printf("执行 logical???(boolean a, boolean b)：");
		System.out.println(Boolean.logicalAnd(false ,true) );//return a && b;

		// 执行 logical???(boolean a, boolean b) 返回将逻辑OR运算符应用于指定的 boolean操作数的结果。
		System.out.println(Boolean.logicalOr(false,true)); // return a || b;
		// 执行 ???Boolean(String s) 将字符串参数解析为布尔值。
		System.out.print(Boolean.parseBoolean("true") + " ");  //true
		System.out.print(Boolean.parseBoolean("false") + " "); //false
		System.out.println(Boolean.parseBoolean("XXX")); //false
		// 执行 ???Of(boolean b) 返回一个 Boolean指定的 boolean值的 Boolean实例。
		System.out.println(Boolean.valueOf(true) ); //return (b ? TRUE : FALSE);
		System.out.println(Boolean.valueOf(false) );

		// 执行 ???Of(String s) 返回一个 Boolean ，其值由指定的字符串表示。
		System.out.println(Boolean.valueOf("true")); // return parseBoolean(s) ? TRUE : FALSE;
	}
	
}
