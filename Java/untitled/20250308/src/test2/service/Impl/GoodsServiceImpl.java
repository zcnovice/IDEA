package test2.service.Impl;

import test2.entity.goods.Clothing;
import test2.entity.goods.Electronics;
import test2.entity.goods.Goods;
import test2.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
    @Override
    public int discount(Goods[] goods) {
        int sumE = 0;
        int sumC = 0;
        for(int i = 0;i < goods.length;i++)
        {
            if(goods[i] instanceof Electronics)
            {
                sumE += goods[i].getPrice();
            } else if (goods[i] instanceof Clothing) {
                sumC += goods[i].getSum();
            }
        }

        //TODO
        if(sumE > 1000)
        {

        }
        if(sumC > 3)
        {

        }



        return 0;
    }

    @Override
    public void Bestsellers() {

    }
}
