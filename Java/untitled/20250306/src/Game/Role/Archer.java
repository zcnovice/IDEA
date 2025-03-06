package Game.Role;

import Game.GameCharacter;

//弓箭手
public class Archer extends GameCharacter {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void performAttack(GameCharacter gameCharacter) {
        //显示攻击者信息
        toString();

        gameCharacter.toString();


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
