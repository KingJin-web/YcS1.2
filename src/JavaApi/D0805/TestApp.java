package JavaApi.D0805;

public class TestApp {
    public static void ThrowException() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            System.out.println("try");
            ThrowException();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }


}

class Test {
    public static void main(String args[]) {
        int a[] = {0, 1, 2, 3, 4};
        int sum = 0;
        try {
            for (int i = 1; i < 6; i++) {
                sum = sum + a[i];
            }
            System.out.println("sum=" + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
        } finally {
            System.out.println("程序结束");
        }
    }
}

class Flow {
    public static void main(String[] args) {
        try {
            System.out.print("before");
            doRiskyThing();
            System.out.print("after ");
        } catch (Exception fe) {
            System.out.print("catch");
        }
        System.out.println(" done");
    }

    public static void doRiskyThing() throws Exception {
        // this code returns unless it throws an Exception
    }
}

class Demo {

    public int add(int a, int b) {

        try {

            return a + b;

        } catch (Exception e) {

            System.out.println("catch语句块");

        } finally {

            System.out.println("finally语句块");

        }

        return 0;

    }

    public static void main(String[] args) {

        Demo demo = new Demo();

        System.out.println("和是：\t" + demo.add(9, 34));

    }

}

class Test2 {
    public static int aMethod(int i) throws Exception {
        try {
            return i / 10;
        } catch (Exception ex) {
            throw new Exception("exception in a aMothod");
        } finally {
            System.out.print("finally");
        }
    }

    public static void main(String[] args) {
        try {
            aMethod(0);
        } catch (Exception ex) {
            System.out.print("exception in main");
        }
        System.out.print("finished");
    }
}

class a{
    public static void main(String[] args) {
//        System.out.println(testException());
//        System.out.println(func());
        System.out.println(getVal("x"));
    }
    public static int testException() {
        int i = 0;
        try {
            i++;
            throw new Exception("error");
        } catch (Exception e) {
            return i++;
        } finally {
            i++;
        }
    }
    public static int func (){
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }finally{
            return 3;
        }
    }
    public static int getVal(String str) {

        int val = 0;
        try {
            val = Integer.parseInt(str);
            return val;
        } catch (NumberFormatException e) {
            return val;
        } finally {
            val = -1;
        }
    }
}