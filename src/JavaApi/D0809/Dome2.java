package JavaApi.D0809;

import java.io.File;
import java.io.IOException;

/**
 * @author 12613
 * 文件
 */
public class Dome2 {
    public static void main(String[] args) throws IOException {
        a();
    }

    private static void a() throws IOException {
        File file1 = new File("D:/b.txt");
        System.out.println(file1.exists());

        File file2 = new File("D:/temp", "a.txt");
        File file3 = new File("D:/temp");
        File file4 = new File(file3, "b.txt");
        System.out.println(file2.exists());
        System.out.println(file3.exists());
        System.out.println(file4.exists());

        try {
            file2.createNewFile();
            File file6 = new File("D:/temp/a");
            file6.mkdir();
            File file7 = new File("D:/temp/a/b/c/d");
            file7.mkdirs();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
