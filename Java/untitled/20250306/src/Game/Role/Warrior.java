package Game.Role;

import Game.GameCharacter;
import Game.Weapon.Weapon;

//战士
public class Warrior extends GameCharacter {

    //子类必须实现父类抽象方法，与父类定义的带参构造方法

    //起始本身就是要实现父类构造方法的，只不过是无参构造---用super（）实现
    public Warrior(String name, int health) {
        super(name, health);
    }

    //刚开始在考虑是否要传一个  武器 当变量
    //但是发现   GameCharacter  里面是有武器的  进行了装备的
    //我Warrior是继承了GameCharacter的，里面有了武器的

    //这里的gameCharacter是我攻击的对象
    @Override
    public void performAttack(GameCharacter gameCharacter) {

        //显示攻击者信息
        System.out.println("Attacker: " + this.toString());
        //toString();

        //gameCharacter.toString();

        System.out.println("Target: " + gameCharacter.toString());

        //具体实现攻击方法
        //gameCharacter.equipWeapon();
        if(weapon == null)
        {
            System.out.println("没有武器");
        }

        weapon.attackEffect();
        int Damage = weapon.getDamage();
        int fDamage = (int) (Damage*1.2);
        int newHealth = gameCharacter.getHealth() - fDamage;
        gameCharacter.setHealth(newHealth);

    }
}












