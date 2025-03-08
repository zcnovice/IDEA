package test2.service;

import test2.entity.goods.Goods;

import java.util.ArrayList;

public interface UserService {


    //TODO
    //一次性消费1000元以上提升为VIP
    void UP();

    //TODO
    //VIP用户消费到一定数量可以提升等级
    void VIPUp();


    /**
     *用户添加商品到购物车
     * @param shoppingCart 购物车
     * @param goods 待添加的商品
     *  不用有返回值了
     */
    void addGoods(ArrayList<Goods> shoppingCart ,Goods goods);


    /**
     * 删除购物车里面的商品
     * @param shoppingCart 购物车
     * @param id 第几个物品
     */
    void deleteGoods(ArrayList<Goods> shoppingCart,int id);



    /**
     *  查看商品列表
     * @param shoppingList 商品列表
     */
    void View(ArrayList<Goods> shoppingList);



    /**
     *  结账
     *  要判断购物车里面哪些东西要够买
     * @param shoppingList 商品列表
     * @param shoppingCar 购物车
     * @return
     */
    int checkout(ArrayList<Goods> shoppingList,ArrayList<Goods> shoppingCar);




    /**
     * 与方法--checkout-- 结合使用
     *  选择购物车里面要购买的商品编号
     * @param shoppingCar 购物车
     * @return 待购买列表
     */
    ArrayList<Integer> selectShopCarID(ArrayList<Goods> shoppingCar);




    /**
     * （通过用户名）查找商品列表里面的商品
     * @param shoppingList 商品列表
     * @param name 商品名
     * @return  返回查找到的商品
     */
    Goods nameSearchShopping(ArrayList<Goods> shoppingList,String name);


}
