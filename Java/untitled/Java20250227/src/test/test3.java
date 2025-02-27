package test;

import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份：");
        int i =sc.nextInt() ;

        switch(i) {
            case 1:
                System.out.println("31天");
                break;

            case 2:

                System.out.println("输入一年份：");
                int t = sc.nextInt();

                if(t % 4 == 0 &&(t%100 != 0 || t % 400 == 0) )
                {
                    System.out.println("29天");
                }
                else {
                    System.out.println("28天");
                }
                break;

            case 3:
                System.out.println("31天");
                break;

            case 4:
                System.out.println("30天");
                break;

            case 5:
                System.out.println("31天");
                break;

            case 6:
                System.out.println("30天");
                break;

            case 7:
                System.out.println("31天");
                break;

            case 8:
                System.out.println("31天");
                break;

            case 9:
                System.out.println("30天");
                break;

            case 10:
                System.out.println("31天");
                break;

            case 11:
                System.out.println("30天");
                break;

            case 12:
                System.out.println("31天");
                break;

            default:
                break;
        }
    }
}
