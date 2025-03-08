package test1.service.Impl;

import test1.entity.Animal;
import test1.entity.DietaryPreferences;
import test1.entity.food.Food;
import test1.service.AnimalService;

public class AnimalServiceImpl implements AnimalService {
    @Override
    public void Feeding(Food food, Animal animal, DietaryPreferences dietaryPreferences) {
        int s = animal.getDietaryPreferences().getAppetite()+food.getSum();
        dietaryPreferences.setAppetite(s);
        animal.setDietaryPreferences(dietaryPreferences);
    }

    @Override
    public boolean Full(Animal animal) {
        if(animal.getDietaryPreferences().getAppetite()>7)
        {
            return true;
        }

        return false;
    }
}
