package Test_1;

public class Car_1 {
    private String brand;//品牌
    private String color = "黑色";//颜色

    public void setColor1 (String color) {
        System.out.println("颜色是："+color);//局部变量
        System.out.println("颜色是："+this.color);//成员变量

        //把传进来的局部变量赋值给成员变量
        this.color = color;

    }
}
