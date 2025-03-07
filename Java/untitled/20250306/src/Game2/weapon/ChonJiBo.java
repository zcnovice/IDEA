package Game2.weapon;

public class ChonJiBo implements EnergyWeapon{
    private String name = "冲击波";
    @Override
    public void chargeEffect() {
        System.out.println("⚡造成电子系统瘫痪！");
    }

    @Override
    public int fire() {
        return 35;
    }

    @Override
    public void cooldown() {

    }

    public String getName() {
        return name;
    }
}
