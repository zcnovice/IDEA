package homework.plant;

import homework.zombie.Zombie;

public class Plant {
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

    public void attackZombie(Zombie zombie) {
        //zombie.setHp(zombie.getHp()-this.attack);
    }
}
