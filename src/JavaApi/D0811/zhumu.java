package JavaApi.D0811;

import Util.io.IOHelper;
import jdk.nashorn.internal.runtime.PropertyMap;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author 12613
 * 瞩目助手 C:\Users\12613\Documents\zhumu\2020-08-11 09.00.47 廖彦个人会议室 1362863660
 */


public class zhumu {


    private final LinkedHashSet<String> stuSet = new LinkedHashSet<>();
    private final LinkedHashSet<String> replySet = new LinkedHashSet<>();
    private File meetingFile;

    public static void main(String[] args) {
        zhumu zm = new zhumu();
        zm.init("吴夏翘,阳晶任,吴宗术,张亚楠,龚毅，张钰婷,张韬,朱炅锋,金嘉慧,易帆,蒋卓航,杨天烨,"
                + "贺子超,舒泽让,关彤,李志勇,钟浣文,许如愿,金鹏,杨强,王红玉");
        zm.setMeetingFile("C:\\Users\\12613\\Documents\\zhumu\\2020-08-11 09.00.47 廖彦个人会议室 1362863660\\meeting_saved_chat.txt");
        System.out.println(zm.meetingFile);
        System.out.println(zm.stuSet);
        zm.parse();
        zm.count();
    }

    /**
     * 导入所有的学生名单
     *
     * @param student
     */
    private void init(String student) {
        String[] stu = student.split(",");
        init(stu);
    }

    private void init(String[] student) {
        List<String> slist = Arrays.asList(student);
        stuSet.addAll(slist);
    }

    public void setMeetingFile(String meetingPath) {
        meetingFile = new File(meetingPath);
        if (!meetingFile.exists()) {
            System.out.println("文件不存在");
            meetingFile = null;
        }
    }

    /**
     * 读取聊天文件内容
     */
    public void parse() {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(meetingFile);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.matches(".+?\\s+.+?\\s:\\s.+")){
                    String name = line.replaceAll(".+?\\s+(.+?)\\s:\\s.+","$1");
                    System.out.println(name);
                    name = name.replaceAll("[\\w-\\s]","");
                    System.out.println(name);
                    replySet.add(name);
                }

            }
           // System.out.println(names);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            IOHelper.close(fr);
            IOHelper.close(br);
        }
    }
    public void count(){
        System.out.println("回复人数 " + replySet.size() +" : "+ replySet);
        LinkedHashSet<String> stuSet = new LinkedHashSet<>();
        stuSet.addAll(this.stuSet);
        stuSet.removeAll(replySet);
        System.out.println("挂机人数 " + stuSet.size() + " : "+ stuSet);
    }
}
