package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        String i = "sc";
        Scanner sc = new Scanner(System.in);
        String i2 = sc.nextLine();

        //比较字符是否相同   要用equals 。  ‘==’是用来比较地址与值的
        System.out.println(i == i2);

        System.out.println(i.equals(i2));


        //=======================================================


        int a = 10;

        int b = 15;

        if(a > b & a++ >10)
        {

        }
        System.out.println(a);

        //左移  *2
        //右移   /2


        if(a > b && a++ >10)
        {

        }
        System.out.println(a);




    }
}
