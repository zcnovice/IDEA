package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个几位数？");
        int k = sc.nextInt();

        System.out.println("输入一个数：");
        int i = sc.nextInt();//345
        for(int j = 0;j<k;j++)
        {
            int t = i % 10;
            System.out.println(t);
            i /= 10;
        }

    }
}
