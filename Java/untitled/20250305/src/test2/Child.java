package test2;

public class Child extends Parent{
    String name = "Child";

    Child() {
        super(); // 调用父类无参构造器（默认隐含，可省略）
    }

    @Override
    void print() {
        super.print(); // 调用父类的 print() 方法
        System.out.println("Child name: " + this.name); // Child
        System.out.println("Parent name: " + super.name); // Parent

        //System.out.println("Grandpa name: " + super.super.name);
        System.out.println("Grandpa name: " + super.getGrandpaName());
    }
}
