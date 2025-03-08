package test2.entity;

public abstract class Goods {

    private String name;
    private Double price;
    private int sum;

    public Goods() {
    }

    public Goods(Double price, String name, int sum) {
        this.price = price;
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
