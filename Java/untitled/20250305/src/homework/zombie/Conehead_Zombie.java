package homework.zombie;

import homework.plant.Plant;

//路障僵尸
public class Conehead_Zombie extends Zombie{
    public Conehead_Zombie(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void  attackPlant(Plant plant)
    {
        System.out.println("路障僵尸攻击"+plant.getName());
        plant.setHp(plant.getHp()-this.attack);
    }
}
