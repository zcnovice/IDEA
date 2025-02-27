package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //判断一个数是不是质数；
        Scanner sc = new Scanner(System.in);
        int d = 0;
        for(int i = 0;i<10;i++)
        {
            System.out.println("输入一个数：");
            int t = sc.nextInt();
            for(int j = 2;j<t;j++)
            {
                if(t % j == 0)
                {
                    d++;
                    break;
                }
            }
            if(d == 0)
            {
                System.out.println("是一个质数");
            }
            d = 0;
        }
    }
}
