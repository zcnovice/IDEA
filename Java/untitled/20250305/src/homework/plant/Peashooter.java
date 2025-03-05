package homework.plant;

import homework.zombie.Zombie;

//豌豆射手
public class Peashooter extends Plant{
    public Peashooter() {
    }

    public Peashooter(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }


    @Override
    public void attackZombie(Zombie zombie) {
        System.out.println("豌豆射手攻击"+zombie.getName());
        zombie.setHp(zombie.getHp()-this.attack);
        //zombie.setHp(zombie.getHp()-this.attack);
    }
}
