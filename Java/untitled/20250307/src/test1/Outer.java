package test1;

public class Outer {
    //静态内部类
    public static class Inter{

    }

    //内部类
    public  class Inter1{

    }


    public void  test(){

        //局部内部类--只可以在方法里面用，并且不可以有访问修饰符（public，private。。。。）
        class Inter2{

        }

        //只可以在该方法中使用
    }
}
