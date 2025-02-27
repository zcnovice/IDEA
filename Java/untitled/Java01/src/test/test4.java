package test;

import java.util.Scanner;

public class test4 {


    //水仙花数
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入一个三位数：");//153
//
//        int num = sc.nextInt();
//
//        int num1 = num;
//        int x = num % 10;
//        num /= 10;
//
//        int y = num % 10;
//        num /= 10;
//
//        int z = num % 10;
//        String string = (num1 == x * x * x + y * y * y +z * z * z) ? "是水仙花数" : "不是水仙花数";
//        System.out.println(string);



        for(int i = 100;i<1000;i++)
        {
            int num = i;
            int a = num % 10;
            num /= 10;
            int b = num % 10;
            num /= 10;
            int c = num % 10;
            if(i == a * a * a + b * b * b + c * c * c)
            {
                System.out.println(i);
            }
        }
    }
}
