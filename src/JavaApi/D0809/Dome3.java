package JavaApi.D0809;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dome3 {

    public static void main(String[] args) {

    }

    public static void copy(String src, String dest) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);

            byte[] buffer =new byte[1024];
            int count;
            while ((count = fis.read(buffer)) > 0){
                fos.write(buffer,0,count);
            }
       } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
