package homework;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "";
        //小写转大写
        for(int i = 0;i<str.length();i++)
        {
            //System.out.println(str.charAt(i));
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                //System.out.println((char)(str.charAt(i) - 32));
                char partner =  (char) (str.charAt(i) - 32);
                str2 += partner;
            }
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')|| (str.charAt(i) >= '0' && str.charAt(i) <= '9'))
            {
                str2 += str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
