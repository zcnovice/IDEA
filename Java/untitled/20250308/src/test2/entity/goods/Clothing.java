package test2.entity;

public class Clothing extends Goods{

    private int size;

    public Clothing() {

    }

    public Clothing(Double price, String name, int sum, int size) {
        super(price, name, sum);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
