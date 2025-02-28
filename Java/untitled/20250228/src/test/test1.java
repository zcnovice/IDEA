package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String[] args1 = new String[5];
        //默认值为null----空地址
        Scanner sc = new Scanner(System.in);
//        for(int i = 0;i<args1.length;i++)
//        {
//            args1[i] = sc.next();
//        }

        int index = 0;
        for(String arg : args1)
        {
            args1[index++] =sc.next();
        }


        for (String s : args1)
            System.out.println(s);
    }
}
