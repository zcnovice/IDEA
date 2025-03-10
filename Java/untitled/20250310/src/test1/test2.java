package test1;

import java.util.UUID;

public class test2 {
    public static void main(String[] args) {
        //静态方法（类名.方法名）来调用

        //常规的方法（new对象    对象.方法名）
        String str = String .join(",","ssss","C++");

        String str1 = String.valueOf(10);//转换为String类型

        Integer i = Integer.parseInt("10");//转换为String类型

        StringBuilder stringBuilder = new StringBuilder("sss");

        stringBuilder.append("fww");

        System.out.println(stringBuilder.toString());//sssfww

        stringBuilder.delete(3,5);//[3,5)
        System.out.println(stringBuilder.toString());//sssw

        stringBuilder.deleteCharAt(3);
        System.out.println(stringBuilder.toString());//sss

        stringBuilder.append("fsdg");

        stringBuilder.reverse();



        System.out.println(stringBuilder.toString());


        for(int i1 = 0;i1<1000;i1++)
        {
            UUID s = UUID.randomUUID();
            System.out.println(s);
        }
    }
}
