package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //输入5个数找 max  3,6,12,67,8
        Scanner s = new Scanner(System.in);
        int max= 0;

        int n = s.nextInt();
        max = n;
        for (int i = 0;i<4;i++)
        {
            n = s.nextInt();
            if(max < n)
            {
                max = n;
            }
        }
        System.out.println("最大值是："+max);
    }
}
