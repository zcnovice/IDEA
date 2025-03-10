package homework;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = s(str);

        System.out.println(str);
    }

    public static String s(String str)
    {
        if(str.length() != 11)
        {

            return "请输入11位手机号码";
        }
        return str.substring(0,3)+"****"+str.substring(7,11);
    }
}
