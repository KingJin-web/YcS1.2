package JavaApi.D0806.Homework;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

/**
 * StringBuffer + StringBuilder 练习
 * @author Administrator
 *
 */
public class ExerciseStringBuXXX {

	public static void main(String[] args) {
		ExerciseStringBuXXX eX = new ExerciseStringBuXXX();
		eX.testStringBuilder();
	}
	public void testStringBuilder() {
		/**
		 * 构造方法
		 */
		// 定义一个没有字符的 StringBuilder 对象
		StringBuilder sb1 = new StringBuilder();

		System.out.println();
		// 定义一个包含有字符串"abcd"没有字符的 StringBuffer 对象
		StringBuilder sb2 = new StringBuilder("abcd");
		System.out.println(sb2);
		// 定义一个没有字符的字符串缓冲区和指定的初始容量( 10 )的 StringBuilder 对象
		StringBuilder sb3 = new StringBuilder(10);
		System.out.println(sb3.capacity());
		/**
		 * 实例方法
		 */
		// 执行	a???(String str) 将指定的字符串附加到此字符序列。
		StringBuilder st1=new StringBuilder("蔡徐坤");
		System.out.println(st1.append("+乔碧萝"));
		// 执行 d???(int start, int end) 删除此序列的子字符串中的字符。
		StringBuilder st2=new StringBuilder("蔡徐坤");
		System.out.println(st2.delete(0,2));
		// 执行 ???Of(String str, int fromIndex) 返回指定子串的第一次出现的字符串中的索引，从指定的索引开始。
		StringBuilder st3=new StringBuilder("蔡徐坤蔡徐坤");
		System.out.println(st3.indexOf("坤",3));
		// 执行 i???(int offset, String str) 将字符串插入到此字符序列中。
		StringBuilder st4=new StringBuilder("I you！");
		System.out.println(st4.insert(1," love"));
		// 执行 ???xOf(String str) 返回指定子字符串最右边出现的字符串内的索引。
		StringBuilder st5=new StringBuilder("lovelove");
		System.out.println(st5.lastIndexOf("e"));
		// 执行 l???() 返回长度（字符数）。
		System.out.println(st5.length());
		// 执行 rep???(int start, int end, String str) 用指定的String中的字符替换此序列的子字符串中的 String 。
		StringBuilder st6=new StringBuilder("dhaucs");
		System.out.println(st6.replace(2,4,"abd"));
		// 执行 rev???() 导致该字符序列被序列的相反代替。( 字符串内容反转 )
		StringBuilder st7=new StringBuilder("abdjsh");
		System.out.println(st7.reverse());
		// 执行 ???string(int start) 返回一个新的 String ，其中包含此字符序列中当前包含的字符的子序列。
		StringBuilder st8=new StringBuilder("sjsjfh");
		System.out.println(st8.substring(2));
		// 执行 sub???(int start, int end) 返回一个新的 String ，其中包含此序列中当前包含的字符的子序列。
		System.out.println(st8.substring(2,4));
		
	}
	
}
