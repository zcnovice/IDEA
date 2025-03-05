package homework.plant;

import homework.zombie.Zombie;

//土豆地雷
public class Potato_Mine extends Plant{
    public Potato_Mine() {
    }

    public Potato_Mine(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public void attackZombie(Zombie zombie) {
        System.out.println("土豆地雷攻击"+zombie.getName());
        zombie.setHp(zombie.getHp()-this.attack);
        //zombie.setHp(zombie.getHp()-this.attack);
    }
}
