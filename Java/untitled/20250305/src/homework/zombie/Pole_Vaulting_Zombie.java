package homework.zombie;

import homework.plant.Plant;

//撑杆僵尸
public class Pole_Vaulting_Zombie extends Zombie{
    public Pole_Vaulting_Zombie(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public void  attackPlant(Plant plant)
    {
        System.out.println("撑杆僵尸攻击"+plant.getName());
        plant.setHp(plant.getHp()-this.attack);
    }
}
