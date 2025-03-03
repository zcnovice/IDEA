package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入字符串对字母排序
        String str = sc.next();
        String str1 =  stringSorting(str);
        System.out.println(str1);
    }





    public static String stringSorting(String str)
    {
        String str1 = "";
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

        //转换为char数组
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = (char) num[i];
        }

        for(char s:arr)
        {
            str1 += s;
        }

        return str1;
    }
}
