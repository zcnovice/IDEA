package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入开始时间：");
        int h = sc.nextInt();
        System.out.println("h");
        int m = sc.nextInt();
        System.out.println("m");

        System.out.println("输入结束时间：");
        int h1 = sc.nextInt();
        System.out.println("h");
        int m1 = sc.nextInt();
        System.out.println("m");

        int num1 = h*60+m;
        int num2 = h1*60+m1;
        int num3 = num2-num1;
        //System.out.println(num3);

        int m3 = num3%60;
        int h3 = num3/60;
        System.out.println("小鱼游了"+h3+"小时"+m3+"分钟");
    }
}
