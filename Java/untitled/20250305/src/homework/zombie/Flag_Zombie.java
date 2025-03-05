package homework.zombie;

import homework.plant.Plant;

//旗帜僵尸
public class Flag_Zombie extends Zombie{
    public Flag_Zombie(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void  attackPlant(Plant plant)
    {
        System.out.println("旗帜僵尸攻击"+plant.getName());
        plant.setHp(plant.getHp()-this.attack);
    }
}
