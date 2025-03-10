package homework;

public class test2 {
    public static void main(String[] args) {
        /*StringBuilder str = new StringBuilder("sdfghjkl");
        StringBuilder s =  str.reverse();
        System.out.println(s);*/

        String str1 = new String("sdfghjkl");
        String str2 = s(str1);
        System.out.println(str2);
    }

    public static String s(String str1)
    {

        char[] val = str1.toCharArray();//将字符串转换为char数组
        int count = str1.length();
        int n = count - 1;
        for (int j = (n-1) >> 1; j >= 0; j--) {
            int k = n - j;
            char cj = val[j];
            val[j] = val[k];
            val[k] = cj;
        }
        String str = "";

        for(int i = 0;i< val.length;i++)
        {
            str+=val[i];
        }
        return str;
    }
}
