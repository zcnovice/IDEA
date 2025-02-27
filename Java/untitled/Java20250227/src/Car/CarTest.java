package Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(Car.getCount()); // 输出2
        //无static则要建立变量进行调用 System.out.println(car1.getCount());
    }
}
