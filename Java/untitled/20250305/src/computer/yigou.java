package computer;

public class yigou {
    public static void main(String[] args) {
        int a = 0;

        //里面每一种数据都是不同的类型
        Object[] o = new Object[]{
                new XiaoMi(),
                new Lenovo(),
                new Computer(),
                a,//转成Integer  继承与Object
                new String("hello")
        };
    }
}
