package Game.Weapon;

public class Fenbao implements Weapon{
    @Override
    public void attackEffect() {
        System.out.println("\uD83C\uDF2A\uFE0F箭矢穿透多个目标！");
    }

    @Override
    public int getDamage() {
        return 35;
    }
}
