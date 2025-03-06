package Game;

import Game.Role.Mage;
import Game.Role.Warrior;
import Game.Weapon.Hangbin;
import Game.Weapon.Huoyanjian;
import Game.Weapon.Weapon;
import Game.Weapon.Fenbao;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("战士1",1200);
        Mage mage = new Mage("法师1",800);

        //装备武器
        Equip_weapons(warrior);
        Equip_weapons(mage);

        //进行对战
        PK(warrior,mage);

    }

    //装备武器
    public static void Equip_weapons(GameCharacter role){
        Weapon[] weapons = {new Fenbao(),new Huoyanjian(),new Hangbin()};
         /*Weapon fenbao = new Fenbao();
        Weapon hangbin = new Hangbin();
        Weapon huoyanjian = new Huoyanjian();*/
        //随机装备武器
        int num = (int)(Math.random()*3);
        System.out.println(num);
        switch (num){
            case 0:
                role.equipWeapon(weapons[0]);
                break;
            case 1:
                role.equipWeapon(weapons[1]);
                break;
            case 2:
                role.equipWeapon(weapons[2]);
                break;
        }
    }

    public static void PK(GameCharacter role1,GameCharacter role2)
    {


        while(role1.getHealth() != 0 && role2.getHealth() != 0)
        {
            int num = (int)(Math.random()*100+1);
            if(num > 50)
            {
                role1.performAttack(role2);
                System.out.println(role1.getName()+"攻击了"+role2.getName());
            }else {
                role2.performAttack(role1);
                System.out.println(role2.getName()+"攻击了"+role1.getName());
            }


            if(role1.getHealth() <= 0)
            {
                System.out.println(role2.getName()+"已经赢了");
                break;
            }else if(role2.getHealth() <= 0)
            {
                System.out.println(role1.getName()+"已经赢了");
                break;
            }
        }
    }
}
