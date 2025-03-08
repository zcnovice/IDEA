package test2.service;

import test2.entity.goods.Goods;

public interface GoodsService {
    int discount(Goods[] goods);

    //TODO
    //统计商品数量（制作畅销商品排序）
    void Bestsellers();
}
