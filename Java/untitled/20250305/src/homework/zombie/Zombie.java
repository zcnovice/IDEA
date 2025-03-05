package homework.zombie;

import homework.plant.Plant;

//僵尸
public class Zombie {
    protected String name;
    protected int hp;
    protected int attack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                '}';
    }

    public void  attackPlant(Plant plant)
    {

    }
}










