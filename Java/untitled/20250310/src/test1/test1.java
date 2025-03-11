package test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Integer s = Integer.valueOf(10);

        Character c = Character.valueOf('s');


        System.out.println();
        String str1 = new String("hefsdafasagsssgewsaf");

        boolean b = str1.contains("he");

        System.out.println(b);

        int i = str1.indexOf("ss");
        int i1 = str1.lastIndexOf('a');
        System.out.println(i);
        System.out.println(i1);

        str1.startsWith("s");//以s开始
        str1.endsWith("S");//以S结尾   返回boolean




       /* 用户注册
        用户名的要求：6-18长度
        密码： 要求字母数字（大写）
        手机号码：
        邮箱验证:*/
        Scanner in = new Scanner(System.in);
      /*  System.out.println("用户名的要求：6-18长度");
        String name = in.nextLine();

        if(name.length()>18)
        {
            System.out.println("超出长度");
        }else if(name.length()<6){
            System.out.println("长度不足");
        }*/

        System.out.println(" 密码： 要求字母数字（有大写字母）");
        String password = in.nextLine();
        boolean b1 = password.matches("^(?=.*[A-Z])[A-Za-z\\d]{8,20}$");
        System.out.println(b1);



        System.out.println("手机号码：");
        String p = in.nextLine();
        boolean b2 = p.matches("^1[3-9]\\d{9}$");
        System.out.println(b2);

        System.out.println("邮箱验证：");
        String e = in.nextLine();
        boolean b3 = e.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        System.out.println(b3);
    }

}
