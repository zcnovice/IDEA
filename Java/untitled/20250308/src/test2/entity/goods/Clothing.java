package test2.entity.goods;

public class Clothing extends Goods{

    private String size;     //(S/M/L)

    public Clothing() {

    }

    public Clothing(Double price, String name, int sum, String size) {
        super(price, name, sum);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
