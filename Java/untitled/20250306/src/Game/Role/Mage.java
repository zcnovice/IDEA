package Game.Role;

import Game.GameCharacter;

//法师
public class Mage extends GameCharacter {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void performAttack(GameCharacter gameCharacter) {
        //显示攻击者信息
        toString();

        gameCharacter.toString();


        if(weapon == null)
        {
            System.out.println("未装备武器");
        }
        //武器攻击特效
        weapon.attackEffect();
        //数值操作
        int Damage =  weapon.getDamage();
        int fDamage = (int) (Damage*1.5);
        int newHealth = gameCharacter.getHealth() - fDamage;
        gameCharacter.setHealth(newHealth);
    }
}
