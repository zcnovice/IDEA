package homework.plant;

import homework.zombie.Zombie;

//喷射蘑菇
public class Puff_shroom extends Plant{
    public Puff_shroom() {
    }

    public Puff_shroom(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public void attackZombie(Zombie zombie) {
        System.out.println("喷射蘑菇攻击"+zombie.getName());
        zombie.setHp(zombie.getHp()-this.attack);
        //zombie.setHp(zombie.getHp()-this.attack);
    }
}
