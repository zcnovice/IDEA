package homework.plant;

import homework.zombie.Zombie;

//寒冰豌豆
public class Snow_Pea extends Plant{

    public Snow_Pea() {
    }
    public Snow_Pea(String name, int hp, int attack)
    {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public void attackZombie(Zombie zombie) {
        System.out.println("寒冰豌豆攻击"+zombie.getName());
        zombie.setHp(zombie.getHp()-this.attack);
        //zombie.setHp(zombie.getHp()-this.attack);
    }
}
