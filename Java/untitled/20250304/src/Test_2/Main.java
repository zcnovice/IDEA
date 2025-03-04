package Test_2;

import Test_2.entity.Monster;
import Test_2.entity.Outeman;
import Test_2.service.MonsterAttack;
import Test_2.service.OutemanAttack;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster("周豪", 100, 10);
        Outeman outeman = new Outeman("赛罗", 1000, 50);

        MonsterAttack monsterAttack = new MonsterAttack();
        OutemanAttack outemanAttack = new OutemanAttack();

        monsterAttack.attack(monster, outeman);

        outemanAttack.attack(monster, outeman);
        outemanAttack.attack(monster, outeman);
        System.out.println("Outeman的HP:" + outeman.getHP());
        System.out.println("Monster的HP:" + monster.getHP());

    }
}
