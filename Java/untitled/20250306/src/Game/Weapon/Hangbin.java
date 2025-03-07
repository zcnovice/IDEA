package Game.Weapon;

public class Hangbin implements Weapon {
    @Override
    public void attackEffect() {
        System.out.println("❄敌人移动速度降低！");
    }

    @Override
    public int getDamage() {
        return 25;
    }

}
