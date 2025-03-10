package hometest;

public class test1 {
    public static void main(String[] args) {
        //创建一个String
        /*
        public String(String original);
        public String(char value[]);
        public String(char value[], int offset, int count);
        public String(byte bytes[]);
        public String(byte bytes[], int offset, int length);
        public String(byte bytes[], Charset charset);*/

        String val1 = "ssdfsfshjhj46kjhlgfkhgYUTGII";
        char[] val2 = {'和','s','是',' ','f','5','d'};//char里面可以存中文
        byte[] val3 = {'s','d','g','o','g'};//byte里面存不下中文，但是byte相比char更小
        String s1 = new String(val1);
        String s2 = new String(val2,2,4);//从2开始，往后4个
        String s3 = new String(val3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        //用法
        /*
        public int length();  //获取字符串的长度
        public boolean equals(Object anObject);//比较两个字符串是否相同
        public boolean equalsIgnoreCase(String anotherString);//忽略大小比较两个字符串是否相同
        public String toLowerCase();//转换为小写
        public String toUpperCase();//转换为大写*/

        String s4 = s1.toUpperCase();

        String s5 = s4.toLowerCase();

        System.out.println(s4);
        System.out.println(s5);



        /*
        public int indexOf(int ch); //获取指定字符在字符串中第一次出现的下标
        public int lastIndexOf(int ch);//获取指定字符在字符串中最后一次出现的下标
        public int indexOf(String str);//获取指定字符串在字符串中第一次出现的下标
        public int lastIndexOf(String str);//获取指定字符串在字符串中最后一次出现的下标
        public char charAt(int index);//获取字符串中的指定下标的字符*/


        int i1 = s5.indexOf('f');
        int i2 = s5.indexOf("sf");
        int i3 = s5.lastIndexOf('d');
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        char c = s4.charAt(2);
        System.out.println(c);

        /*
        public String substring(int beginIndex);//从指定开始位置截取字符串，直到字符串的末尾
        public String substring(int beginIndex, int endIndex);//从指定开始位置到指定结束位置截取字符串*/


        String s6 = s1.substring(15,20);
        System.out.println(s6);





         /*
        public String replace(char oldChar, char newChar);//使用新的字符替换字符串中存在的旧的字符
        public String replace(CharSequence target, CharSequence replacement);//使用替换的字符串来替换字符串中的就的字符串
        public String replaceAll(String regex, String replacement);//使用替换的字符串来替换字符串中满足正则表达式的字符串
        */

        String s7 = "sf**Td*CI**sDd*ds**";
        String s8 = s7.replace("*","&");
        System.out.println(s8);

        String s9 = s7.replace("**","%");
        System.out.println(s9);

        String s10 = s7.replaceAll("[A-Z]","");//把所有大写字母清除
        System.out.println(s10);




        /*
        public String concat(String str);//将字符串追加到末尾
        public String trim();//去除字符串两端的空白字符
        public String[] split(String regex);//1 将字符串按照匹配的正则表达式分割
        public boolean matches(String regex); //检测字符串是否匹配给定的正则表达式*/

        String s11 = "ahewvsh是2";
        String s12 = s11.concat("nishi");
        System.out.println(s12);

        String s = "a1b2c3d4e5A";//[a-z0-9]+
        String[] arr = s.split("[0-9]");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        String personInfo = "刘德华,男,53,很帅气";
        String[] arr1 = personInfo.split(",");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        String regex = "[a-z0-9]+";
        boolean match = s.matches(regex);
        System.out.println(match);



        //静态方法（要用String.方法名）

        //以‘@@’位分割符，分割后面的String
        String str = String.join("@@","C++","Python","Java");
        System.out.println(str);

        //转换为String
        String str1 = String.valueOf(10);
        System.out.println(str1+1);


        int num =  Integer.parseInt("10");
//      Float.parseFloat()
//      Double.parseDouble()
        System.out.println(num+1);

    }
}
