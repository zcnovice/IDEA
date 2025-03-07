package Game2.weapon;

public class JiGuang implements EnergyWeapon{
    private String name = "激光炮";
    @Override
    public void chargeEffect() {
        System.out.println("\uD83C\uDF00激光穿透护盾！");
    }

    @Override
    public int fire() {
        return 40;
    }

    @Override
    public void cooldown() {

    }

    public String getName() {
        return name;
    }
}
