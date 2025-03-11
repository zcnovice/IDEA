package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {
    public static void main(String[] args) throws IOException {

        File file = new File("D.//aa.txt");
        FileWriter fw = new FileWriter(file);/* 异常可以向外抛出  但是调用方法时就需要解决我抛出的异常  可以try-catch  也可以继续向外面抛*/


        String str = "kjjj";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = null;
        try {
            date = simpleDateFormat.parse(str);
            //上面异常了，下面不执行
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println("异常");
        }catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }finally {
            //可能上面有异常没有捕获到，后面就不会执行了
            System.out.println("不管有没有异常，都会执行");
        }
        System.out.println("正常执行");
    }
    public static void add(int age)
    {
        if(age<0)
        {
            throw new IllegalArgumentException("年龄不可为负");
        }
    }

    public static void s(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("文件不存在: " + file.getAbsolutePath());
        }
    }



}
