package homework;

import homework.plant.*;
import homework.zombie.*;

public class Main {
    public static void main(String[] args) {
        Plant[] plants = {
                new Peashooter("豌豆射手", 200, 50),
                new Cherry_Bomb("樱桃炸弹", 310, 40),
                new Snow_Pea("寒冰射手", 250, 40),
                new Potato_Mine("土豆雷", 220, 800),
                new Puff_shroom("喷射蘑菇", 200, 50)
        };


        Zombie[] zombie = {
                new Pole_Vaulting_Zombie("撑杆跳僵尸", 400, 150),
                new Buckethead_Zombie("铁桶僵尸", 300, 100),
                new Conehead_Zombie("撑杆跳僵尸", 400, 150),
                new Flag_Zombie("旗帜僵尸", 400, 150)
        };

        Pk pk = new Pk();

        int number = (int)(Math.random()*5);
        int number1 = (int)(Math.random()*4);


        pk.pk1v1(plants[number],zombie[number1]);

    }
}
