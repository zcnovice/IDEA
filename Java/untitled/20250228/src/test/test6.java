package test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入字符串对字母排序
        String str = sc.next();
        //获取每一个字符

        //char[] arr1 = str.toCharArray();

        char[] arr = new char[str.length()];
        for(int i= 0;i<str.length();i++)
        {
            arr[i] = str.charAt(i);
        }

        //转换为int数组
        int[] num = new int[str.length()];
        for(int i = 0;i<arr.length;i++)
        {
            num[i] = arr[i];
        }

        //排序
        paixUnits2(num);

        //转换为char数组
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = (char) num[i];
        }

        //打印
        for (char s:arr)
            System.out.print(s);

    }


    public static int[] paixUnits2(int[] num)
    {
        //冒泡排序
        for(int i = 1;i<num.length;i++)
        {
            for(int j = 0;j<num.length-i;j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return num;
    }


    public static void Print(int[] num)
    {
        for(int num1 :num)
        {
            System.out.print(num1 +" ");
        }
    }
}
