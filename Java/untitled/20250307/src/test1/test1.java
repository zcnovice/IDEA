package test1;

public class test1 {
    public static void main(String[] args) {
        Outer.Inter inter = new Outer.Inter();

        Outer outer = new Outer();
        Outer.Inter1  inter1 = outer.new Inter1();


        outer.test();

        USB usb = new USB() {
            @Override
            public void ss() {
                System.out.println("匿名内部类实现");
            }
        };

        usb.ss();
        //优点,只用一次的话，不用在外面声明很多类的实现文件


        USB usb1 = ()-> System.out.println("sss");
        //接口里面只能有一个方法  匿名内部类可以使用抽象类
        //但lambda表达式只可以是接口
    }
}
