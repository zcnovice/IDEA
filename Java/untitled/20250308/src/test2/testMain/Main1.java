package test2.testMain;

import test2.entity.goods.Clothing;
import test2.entity.goods.Electronics;
import test2.entity.goods.Goods;
import test2.entity.user.User;
import test2.entity.user.VIPUser;
import test2.service.Impl.UserServiceImpl;
import test2.service.UserService;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        User VIPuser = new VIPUser("张三",25,3234);

        Goods goods1 = new Electronics(299.99,"小米手环9",50,"小米");

        Goods goods2 = new Electronics(129.0,"小米充电宝",150,"小米");

        Goods goods3 = new Electronics(5999.99,"小米手机15pro",20,"小米");


        Goods goods4 = new Clothing(350.0,"运动鞋",210,"李宁");

        Goods goods5 = new Clothing(2050.0,"休闲鞋",10,"耐克");


        //使用集合List来存储货物
        ArrayList<Goods> shoppingList = new ArrayList<>();
        ArrayList<Goods> shoppingCar = new ArrayList<>();

        shoppingList.add(goods1);
        shoppingList.add(goods2);
        shoppingList.add(goods3);
        shoppingList.add(goods4);
        shoppingList.add(goods5);

        Goods s = shoppingList.get(1);
        System.out.println(s.getSum());


        UserService userService = new UserServiceImpl();
        userService.View(shoppingList);
        System.out.println("==========================");

        userService.View(shoppingCar);
        System.out.println("==========================");
        userService.addGoods(shoppingCar,goods2);
        userService.View(shoppingCar);
        System.out.println("==========================");
        userService.addGoods(shoppingCar,goods3);
        userService.View(shoppingCar);
        System.out.println("==========================");
        userService.addGoods(shoppingCar,goods2);
        userService.addGoods(shoppingCar,goods5);
        userService.addGoods(shoppingCar,goods1);
        userService.View(shoppingCar);

        System.out.println("========================================");
        userService.deleteGoods(shoppingCar,3);
        //userService.View(shoppingCar);

        int totalPrice= userService.checkout(shoppingList,shoppingCar);
        System.out.println("付款金额"+totalPrice);
    }
}
