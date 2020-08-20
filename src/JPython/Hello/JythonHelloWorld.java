package JPython.Hello;

import org.python.util.PythonInterpreter;

/**
 * # 左下三角九九乘法表
 * for row in range(1,10): #打印行
 *     for col in range(1,row+1): #打印列
 *         print("{0}*{1}={2:2d}".format(row,col,row*col),end=" ")
 * #这里是用format函数进行格式化输出控制，{2:2d}是给{2}这个位置两倍的空间，对齐乘法表
 * #同时end是print函数内置方法，设置end=""print就不会进行换行操作
 *     print(" ") #这里是用print的特性，进行换行输出
 */
public class JythonHelloWorld {
    public static void main(String[] args) {
        try (PythonInterpreter pyInterp = new PythonInterpreter()) {
            pyInterp.exec("for row in range(1,10):");
            pyInterp.exec("for col in range(1,row+1):");
            pyInterp.exec("print(\"{0}*{1}={2:2d}\".format(row,col,row*col),end=\" \")");

        }
    }
}