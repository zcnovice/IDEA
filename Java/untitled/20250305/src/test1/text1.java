package test1;

import org.w3c.dom.ls.LSOutput;

public class text1 {

    int a = 10;
    public text1() {
        System.out.println("test1");
    }

    public static void main(String[] args) {
        test2 t2 = new test2();

    }
}

class test2 extends text1{
    int a = 20;


    public test2() {
        super();//默认是有的，不写也有
        System.out.println("test2");
    }

}
