package Test_2.service;

import Test_2.entity.Monster;
import Test_2.entity.Outeman;

public class OutemanAttack {
    public void attack(Monster monster, Outeman outeman){
        System.out.println(outeman.getName() +"对" + monster.getName()+"攻击");
        monster.setHP(monster.getHP()-outeman.getAttack());
        if(monster.getHP()>0)
        {
            //monster.setHP(monster.getHP()-outeman.getAttack());
        }
        else {
            System.out.println(monster.getName()+"已经死亡");
        }

    }
}
