package JavaApi.D0815.Homework;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + '\t');
            }
            System.out.println();
        }
    }
}

/**
 * @author 12613
 */
class A {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        //从控制台读入一个整数，bai也可以在这直du接给a赋给初值
        System.out.print(a+"的所有因子是zhi：");
        for(int i = 1;i<=a;i++){
            if(a%i==0){
                //a对i取余，能除尽i就是a的因子
                System.out.print(i+" ");
                //打印这个i值
            }
        }
    }
}

class B {
    //计算分解的个数
    static int count=0;
    public static void factor(int n)
    {
        //每次n=1代表一次分解成功
        if(n==1)
        { //次数+1
            count++;
        }

        for (int i=2;i<=n;i++)
        {
            //如果取余为0说明可以整除
            if(n%i==0)
            {
                //n整除i，直到n变为1
                factor(n/i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //输入分解的整数
        int n=input.nextInt();
        //执行分解函数
        factor(n);
        //输出次数
        System.out.println(count);
    }
}



class SumIsN {
    static int n;
    static int m;
    static int[] arr;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        m=Integer.parseInt(input.nextLine());
        input.close();
        arr=new int[m];
        for (int i = 1; i <= m; i++) {
            computer(0,i);
        }

    }
    public static void computer(int time,int n){
        if(time>=n){
            if(getSum(n)==m){
                printf(n);
            }
            return;
        }

        for (int i = 0; i < m; i++) {
            arr[time]=i+1;
            if(time>0&&arr[time]<arr[time-1]){
            }else{
                computer(time+1,n);
            }

        }
    }
    public static void printf(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static int getSum(int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}