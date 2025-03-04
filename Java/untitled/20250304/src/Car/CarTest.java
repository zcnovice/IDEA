package Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Xiaomi-SU7-Ultra";
        car.color = "黄色";
        car.price = 529900;
        car.speed = 300;

        car.run(car.brand,car.speed);
        System.out.println(car.toString());
    }
}
