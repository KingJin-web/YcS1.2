package JavaApi.D0806.Homework;




/**
 * 字符串练习
 * 请参考API: http://www.matools.com/api/java8
 */
public class ExerciseString1 {
    public static void main(String[] args) {
//		String a = "a";
//		String b = "b";
//		System.out.println(a == b);
//		String c = new String("a");
//		System.out.println(a == c);
//		System.out.println(b == c);
//		System.out.println(a.equals(c));
//		System.out.println(b.equals(c));
        ExerciseString1 e = new ExerciseString1();
        e.testString();

    }

    public void testString() {
        /**
         * 构造方法
         */
        // String(String original) 初始化新创建的String对象，使其表示与参数相同的字符序列;
        //							换句话说，新创建的字符串是参数字符串的副本。
        String s = new String("abc");
        // String(char[] value)	分配一个新的 String ，以便它表示当前包含在字符数组参数中的字符序列。
        char[] chars = {'a', 'b', 'c'};
        String b = new String(chars);
        System.out.println(b);
        // String(char[] value, int offset, int count) 分配一个新的 String ，其中包含字符数组参数的子阵列中的字符。
        String s1 = new String(chars, 0, chars.length);
        System.out.println(s1);
        // String(byte[] bytes) 通过使用平台的默认字符集解码指定的字节数组来构造新的 String 。
        byte[] bytes = {110, 113, 120};
        String c = new String(bytes);
        System.out.println(c);
        // String(byte[] bytes, Charset charset) 构造一个新的String由指定用指定的字节的数组解码charset 。
        byte buy[] = {110, 113, 120};
        String string = new String(buy, 0, buy.length);
        System.out.println("接受的消息= " + string);
        /**
         * 实例方法
         */
        // 执行 ???At(int index) 返回 char指定索引处的值。
        String s11 = "abcde";
        System.out.println(s11.charAt(2));
        // 执行 ???To(String anotherString) 按字典顺序比较两个字符串。
        System.out.println("bbb".compareTo("aaa"));
        System.out.println("AAA".compareTo("BBB"));
        // 执行 con???(String str) 将指定的字符串连接到该字符串的末尾。
//		concat(String str)
        System.out.println("I love ".concat("you"));//I love you
        // 执行 con???(CharSequence s) 当且仅当此字符串包含指定的char值序列时才返回true。
        System.out.println("蔡徐坤".contains("蔡"));    //true
        System.out.println("蔡".contains("蔡徐坤"));    //false
        // 执行 ???With(String suffix) 测试此字符串是否以指定的后缀结尾。
        System.out.println("蔡徐坤".endsWith("坤"));  //true
        System.out.println("坤".endsWith("蔡徐坤"));  //false
        // 执行 equals???(String anotherString) 将此 String与其他 String比较，忽略案例注意事项。( 忽略大小写 )
//		public boolean equalsIgnoreCase(String anotherString)将此String与其他String比较，忽略案例注意事项。 如果两个字符串的长度相同，并且两个字符串中的相应字符等于忽略大小写，则两个字符串被认为是相等的。
//		如果以下至少一个为真，则两个字符c1和c2被认为是相同的忽略情况：
//		System.out.println("执行 equals???(String anotherString):");
        System.out.println("ABC".equalsIgnoreCase("abc")); //true
        System.out.println("aaa".equalsIgnoreCase("sss"));//false
        // 执行 get???() 使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中。
        String sGet = "Hello";
        byte sbyte[] = sGet.getBytes();
        for (int i = 0; i < sbyte.length; i++)
            System.out.println(" Index " + i + "is : " + sbyte[i]);
        String d1 = "cool";

        // 执行 ???Of(int ch) 返回指定字符第一次出现的字符串内的索引。
//		public int indexOf(int ch, int fromIndex)
        System.out.println("HeAAallo".indexOf(97)); // 97="a"
        // 执行 ???Of(int ch, int fromIndex) 返回指定字符第一次出现的字符串内的索引，以指定的索引开始搜索。
        System.out.println("HeAAallo".indexOf(97, 3));
//		char ss ='e';
//		System.out.println((int)ss);
        // 执行 ???Of(String str) 返回指定子字符串第一次出现的字符串内的索引。
        System.out.println("HeAAallo".indexOf("a"));
        // 执行 ???Of(String str, int fromIndex) 返回指定子串的第一次出现的字符串中的索引，从指定的索引开始。
        System.out.println("Helzzzzlo".indexOf("l", 3));
        // 执行 is???() 返回 true如果，且仅当 length()为 0 。
        System.out.println("".isEmpty());
        // 执行 ???Of(int ch) 返回指定字符的最后一次出现的字符串中的索引。
        System.out.println("abcadef".lastIndexOf(97));
        // 执行 ???Of(String str) 返回指定子字符串最后一次出现的字符串中的索引。
        System.out.println("abcadef".lastIndexOf("a"));
        // 执行 len???() 返回此字符串的长度。
        System.out.println("abcd".length());
        // 执行 replace???(String regex, String replacement)
        //				用给定的替换替换与给定的 regular expression匹配的此字符串的每个子字符串。
        String Str = new String("www.google.com");

        System.out.print("匹配成功返回值 :");
        System.out.println(Str.replaceAll("(.*)google(.*)", "baidu"));
        System.out.print("匹配失败返回值 :");
        System.out.println(Str.replaceAll("(.*)taobao(.*)", "baidu"));

        // 执行 replace???(String regex, String replacement)
        //				用给定的替换替换与给定的 regular expression匹配的此字符串的第一个子字符串。

        System.out.println(Str.replaceFirst("(.*)google(.*)", "baidu"));
        // 执行 sp???(String regex) 将此字符串分割为给定的 regular expression的匹配。
        String[] result = "this is a test".split("s");
        for (int x = 0; x < result.length; x++)
            System.out.println(result[x]);
        // 执行 ???With(String prefix) 测试此字符串是否以指定的前缀开头。
        System.out.println("ABC".startsWith("B"));
        System.out.println("ABC".startsWith("A")); //true
        // 执行 ???string(int beginIndex)(String prefix) 返回一个字符串，该字符串是此字符串的子字符串。
        System.out.println("ABCD".substring(2)); //CD

        // 执行 ???string(int beginIndex, int endIndex) 返回一个字符串，该字符串是此字符串的子字符串。
        System.out.println("I love you".substring(2, 6));
        // 执行 to???() 将此字符串转换为新的字符数组。
        char[] result1 = "toCharArray".toCharArray();
        for (int x = 0; x < result1.length; x++) {
            System.out.print(result1[x]);
        }
        // 执行 to???() 将所有在此字符 String使用默认语言环境的规则，以小写。( 转小写 )toLowerCase()
        System.out.println();
        System.out.println("toLowerCASE".toLowerCase());
        // 执行 tr???() 将所有在此字符 String使用默认语言环境的规则大写。( 转大写 )
        System.out.println("toUpperCase".toUpperCase());
        // 执行 to???() 返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。

        /**
         * 静态方法
         */
        // 执行 for???(String format, Object... args) 使用指定的格式字符串和参数返回格式化的字符串。
        //format(String format, Object... args)
        // https://blog.csdn.net/luoweifu/article/details/13775921
        // ------>   你可以成为平凡的人（字符串替换）
        System.out.println(String.format("你可以成为%s", "平凡的人"));
        //------>   你可以成为平凡的人，他也可以成为不平凡的人。
        System.out.println(String.format("你可以成为%s，他也可以成为%s", "平凡的人", "不平凡的人"));
        // ------>   你可以成为不平凡的人，他也可以成为平凡的人。（位置控制通过[argument_index$]）
        System.out.println(String.format("你可以成为%2$s，他也可以成为%1$s", "平凡的人", "不平凡的人"));
        // ---------->14  （10进制转8进制）
        System.out.println(String.format("%o", 12));
        // ----------> c  （10进制转16进制）
        System.out.println(String.format("%x", 12));
        //-------------> 12,302,562  (flag 的用法，这里用都好隔开，并转换成10进制。）
        System.out.println(String.format("%1$,d", 12302562));
        //--------------> 00123456  (width的用法，用0填充（flag），最少8位。
        System.out.println(String.format("%1$08d", 123456));
    }
}
