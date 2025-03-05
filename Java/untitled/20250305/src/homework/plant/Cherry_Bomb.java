package homework.plant;

import homework.zombie.Zombie;

//樱桃炸弹
public class Cherry_Bomb extends Plant{
    public Cherry_Bomb() {
    }

    public Cherry_Bomb(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public void attackZombie(Zombie zombie) {
        System.out.println("樱桃炸弹攻击"+zombie.getName());
        zombie.setHp(zombie.getHp()-this.attack);
        //zombie.setHp(zombie.getHp()-this.attack);
    }
}
