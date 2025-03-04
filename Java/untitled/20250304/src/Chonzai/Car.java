package Chonzai;

public class Car {
    public String brand;//品牌
    public String color;//颜色
    public int price;//价格

    //无参构造方法
    public Car() {
        System.out.println("Car");
    }

    //构造方法
    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Car(String brand, String color, int price) {
        this(brand,color);
        this.price = price;
    }


    public void run(){
        System.out.println("汽车在跑");
    }

    public void run(String brand){
        System.out.println(this.brand+"汽车在跑");
    }

    public void run(String brand,String color){
        System.out.println(this.brand+"汽车在跑"+this.color);
    }
}
