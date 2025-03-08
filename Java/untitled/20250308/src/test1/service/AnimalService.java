package test1.service;

import test1.entity.Animal;
import test1.entity.DietaryPreferences;
import test1.entity.food.Food;

public interface AnimalService {
    //投喂
    void Feeding(Food food,Animal animal, DietaryPreferences dietaryPreferences);
    //判断是否吃饱
    boolean Full(Animal animal);
}
