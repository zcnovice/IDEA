package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        String[][] users = {
                {"root","1234567"},
                {"admin","123456"}
        };

        String[][] str = arrayExpansion(users);

        arrayCopy(users,str);

        Scanner in = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = in.next();
        System.out.println("请输入密码：");
        String password = in.next();

        str[str.length - 1] = new String[]{username,password};
        Print(str);
    }



    //打印信息
    public static void Print(String[][] users)
    {
        for(String[] user : users)
        {
            System.out.print("用户名："+user[0]+" 密码："+user[1]);
            System.out.println();
        }
    }


    //String[][]数组扩容
    public static String[][] arrayExpansion(String[][] users)
    {
        String[][] str = new String[users.length+1][];
        return str;
    }

    //数组拷贝
    public static void arrayCopy(String[][] users, String[][] str){
        for(int i = 0;i<users.length; i++)
        {
            str[i] = users[i];
        }
    }
}
