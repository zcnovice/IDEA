package homework.zombie;

import homework.plant.Plant;

//铁桶僵尸
public class Buckethead_Zombie extends Zombie{
    public Buckethead_Zombie(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void  attackPlant(Plant plant)
    {
        System.out.println("铁桶僵尸攻击"+plant.getName());
        plant.setHp(plant.getHp()-this.attack);
    }
}
