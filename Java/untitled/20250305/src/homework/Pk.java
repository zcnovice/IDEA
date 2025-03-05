package homework;

import homework.plant.Plant;
import homework.zombie.Zombie;

public class Pk {
    public void pk1v1(Plant plant, Zombie zombie){
        do{
            //PK
            int number = (int)(Math.random()*100);

            if(number > 30 ){
                //植物攻击僵尸
                plant.attackZombie(zombie);
            }else{
                //僵尸攻击植物
                zombie.attackPlant(plant);
            }
        }while (plant.getHp()>0 && zombie.getHp() > 0);

        if(plant.getHp()<=0){
            System.out.println(zombie.getName()+"胜利了");
        }else{
            System.out.println(plant.getName()+"胜利了");
        }
    }
}
