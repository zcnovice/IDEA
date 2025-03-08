package test1.entity;

public class Cat extends Animal{

    //卖萌
    private boolean Sell_moe;


    public Cat(String name, int age, boolean sell_moe) {
        super(name, age);
        Sell_moe = sell_moe;
    }

    public boolean isSell_moe() {
        return Sell_moe;
    }

    public void setSell_moe(boolean sell_moe) {
        Sell_moe = sell_moe;
    }

    @Override
    public void call() {
        System.out.println("喵喵叫");
    }


}
