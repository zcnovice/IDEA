package File1;

import java.io.File;

public class file2 {
    public static void main(String[] args) {
        File file = new File("D:\\Java113\\IDEA\\IOtest1");
        ss(file);
    }

    public static void ss(File files)
    {
        if(files.exists())//是否存在
        {
            File[] file = files.listFiles();
            for (File file1 : file) {

                if(file1.isDirectory())//是否是目录
                {
                    ss(file1);
                }
                System.out.println(file1.getName());//对每个对象getName()
            }
        }
    }
}
