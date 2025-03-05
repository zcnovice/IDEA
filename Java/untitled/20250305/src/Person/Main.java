package Person;

public class Main {
    public static void main(String[] args) {
        Person person1 =  new Person("张三", 20, "12345678901");
        Person person2 =  new Person("张三", 20, "12345678901");
        Person person3 =  new Person("李四", 40, "12345678902");
        boolean flag =  person1.equals(person3);
        System.out.println("是否一致："+flag);
    }
}
