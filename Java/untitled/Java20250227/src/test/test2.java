package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for(int i = 0;i<10;i++)
        {
            System.out.println("输入一年份：");
            int t = sc.nextInt();

            if(t % 4 == 0 &&(t%100 != 0 || t % 400 == 0) )
            {
                System.out.println("是闰年");
            }
            else {
                System.out.println("是平年");
            }
        }


    }

}
