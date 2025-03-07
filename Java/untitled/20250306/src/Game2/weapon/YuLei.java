package Game2.weapon;

public class YuLei implements EnergyWeapon {
    private String name = "量子鱼类";
    @Override
    public void chargeEffect() {
        System.out.println("\uD83D\uDCA3引发空间震荡！");
    }

    @Override
    public int fire() {
        return 60;
    }

    @Override
    public void cooldown() {

    }

    public String getName() {
        return name;
    }
}
