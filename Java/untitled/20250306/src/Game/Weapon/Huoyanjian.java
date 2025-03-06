package Game.Weapon;

public class Huoyanjian implements Weapon {
    public void attackEffect() {
        System.out.println("\uD83D\uDD25火焰灼烧敌人！");
    }

    @Override
    public int getDamage() {
        return 30;
    }
}
