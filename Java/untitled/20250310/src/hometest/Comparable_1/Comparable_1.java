package hometest.Comparable_1;

public class Comparable_1 {
    public static void main(String[] args) {
        Person p1 = new Person("张三",19);
        Person p2 = new Person("李四",23);
        //比较自定义的数据类型
        //比如比较p1与p2谁大  ，就要我自己来写，有两种方法
        int b=  p1.compareTo(p2);
        System.out.println(b);
    }
}
