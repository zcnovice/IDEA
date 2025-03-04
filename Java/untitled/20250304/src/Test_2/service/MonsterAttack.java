package Test_2.service;

import Test_2.entity.Monster;
import Test_2.entity.Outeman;

public class MonsterAttack {
    public void attack(Monster monster, Outeman outeman){
        System.out.println(monster.getName() +"对" + outeman.getName()+"攻击");
        outeman.setHP(outeman.getHP()-monster.getAttack());
        if(outeman.getHP()>0)
        {

        }
        else {
            System.out.println(outeman.getName()+"已经死亡");
        }
    }
}
