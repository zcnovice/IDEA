package Car;

public class Car {
    private static int count = 0; // 静态变量
    public Car() {
        count++; // 每创建一个Car对象，count+1
    }
    public static int getCount() {
        return count; // 直接通过类名访问
    }
}
