package test2.entity.goods;

public class Electronics extends Goods{

    private String brand;

    public Electronics() {
    }

    public Electronics(Double price, String name, int sum, String brand) {
        super(price, name, sum);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
