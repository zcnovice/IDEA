package test2.service.Impl;

import test2.entity.goods.Goods;
import test2.service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    @Override
    public void UP() {

    }

    @Override
    public void VIPUp() {

    }

    @Override
    public void addGoods(ArrayList<Goods> shoppingCart,Goods goods) {
        //判断是否还有货物
        if(goods.getSum() > 0)
        {   //有货就添加进购物车（付款时货物才减一）
            shoppingCart.add(goods);
        }
    }

    @Override
    public void deleteGoods(ArrayList<Goods> shoppingCart, int id) {
        shoppingCart.remove(id-1);
    }


    @Override
    public void View(ArrayList<Goods> shoppingList) {
       for(int i = 0;i<shoppingList.size();i++)
       {
           System.out.print(i+1+". ");
            Goods goods = shoppingList.get(i);
           System.out.println(goods.toString());
       }
    }

    @Override
    public int checkout(ArrayList<Goods> shoppingList,ArrayList<Goods> shoppingCar) {
        //先展示购物车
        View(shoppingCar);

        //让用户选择要购买的商品编号
        ArrayList<Integer> purchasedList = selectShopCarID(shoppingCar);

        //商品总价
        int  totalPrice = 0;
        //遍历结账
        for(int i = 0;i < purchasedList.size();i++)
        {
            //找到对应编号的商品 判断数量  进行商品数量减一 totalPrice加上价格  重购物车移除商品
            //找到对应编号的商品
            int shoppingId = purchasedList.get(i)-1;

            /*错过 注意这里要减一，不减一会溢出*/
            shoppingCar.get(shoppingId);
            //判断数量
            if(shoppingCar.get(shoppingId).getSum() <= 0)
            {
                System.out.println(shoppingCar.get(shoppingId).getName()+"已经没有货了");
                //没有货了，移出购物车
                shoppingCar.remove(shoppingId);
            }
            else {
                //有货 ---搜索到商品列表里面的商品(遍历)，对数量-1;

                //eg:我要查购物车里的第五个那么他的下标因该是5-1 = 4
                String name =  shoppingCar.get(shoppingId).getName();
                //查找到对应货物  数量-1
                Goods goods= nameSearchShopping(shoppingList,name);
                goods.setSum(goods.getSum()-1);
                //totalPrice加上价格
                totalPrice += goods.getPrice();
                //（从购物车中）移除货物
                //TODO
                /*不应该每个货物购买了，就移除货物，这样会影响后面货物查找（移除）因该全部移除完后再直接移除购物车里已经购买的东西
                shoppingCar.remove(shoppingId);*/
            }
        }
        return totalPrice;
    }

    @Override
    public ArrayList<Integer> selectShopCarID(ArrayList<Goods> shoppingCar) {
        //建立待购卖商品编号列表
        ArrayList<Integer> purchasedList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<shoppingCar.size();i++)
        {
            System.out.println("输入要购买的商品编号");
            int s = in.nextInt();
            if(s == 0)
            {
                break;
            }
            else{
                purchasedList.add(s);
            }
        }
        return purchasedList;
    }

    @Override
    public Goods nameSearchShopping(ArrayList<Goods> shoppingList,String name) {

        for(int i = 0;i<shoppingList.size();i++)
        {
            //TODO
            if((shoppingList.get(i).getName()).equals(name))
            {
                return shoppingList.get(i);
            }
        }
        //未查询到
        return null;
    }
}
