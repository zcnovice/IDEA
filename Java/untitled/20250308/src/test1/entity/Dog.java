package test1.entity;

public class Dog extends Animal{
    private String size;


    public Dog(String name, int age, String size
    ) {
        super(name, age);
        this.size = size;
    }

    @Override
    public void call() {
        System.out.println("旺旺叫");
    }
}
