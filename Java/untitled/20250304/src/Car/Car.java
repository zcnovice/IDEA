package Car;

public class Car {

    public String brand;//品牌
    public String color;//颜色
    public int price;//价格
    public int displacement;//排量
    public int speed;//速度


    public void run(String brand,int speed){
        System.out.println(this.brand+"在高速上跑到"+speed+"km/h");
    }

    public void setSpeed(int s) {
        this.speed = s;
    }

    public void stop(){
        System.out.println("汽车在停");
    }
    public void reversing()
    {
        System.out.println("汽车在倒车");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", displacement=" + displacement +
                ", speed=" + speed +
                '}';
    }
}
