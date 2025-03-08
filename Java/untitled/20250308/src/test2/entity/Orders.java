package test2.entity;

import test2.entity.goods.Goods;
import test2.entity.user.User;

import java.util.Arrays;

//d订单信息
public class Orders {
    private User user;
    //商品有多件
    private Goods[] goods;

    //总金额
    private int totalAmount;

    //支付状态
    private boolean paymentStatus;

    public Orders() {
    }

    public Orders(User user, Goods[] goods, int totalAmount, boolean paymentStatus) {
        this.user = user;
        this.goods = goods;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "user=" + user +
                ", goods=" + Arrays.toString(goods) +
                ", totalAmount=" + totalAmount +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
