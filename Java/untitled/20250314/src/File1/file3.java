package File1;

import java.io.*;

public class file3 {
    public static void main(String[] args) {
        File file = new File("D:\\Java113\\IDEA\\IOtest1\\test1\\2.png");
        File newFile = new File("D:\\Java113\\IDEA\\IOtest1\\test3\\2.png");

        InputStream in = null;
        OutputStream out = null;


        try {
            in = new FileInputStream(file);
            out = new FileOutputStream(newFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
