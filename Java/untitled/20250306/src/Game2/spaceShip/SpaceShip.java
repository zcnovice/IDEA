package Game2.spaceShip;

import Game2.weapon.EnergyWeapon;

public abstract class SpaceShip {
    //飞船名
    private String callsign;
    //护盾
    private int shield;
    //武器
    private EnergyWeapon weapon;

    public SpaceShip() {
    }

    //写构造函数方便子类调用---super（传参）
    public SpaceShip(String callsign, int shield) {
        this.callsign = callsign;
        this.shield = shield;
    }


    //这里写了get和set子类可以直接调用
    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public EnergyWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(EnergyWeapon weapon) {
        this.weapon = weapon;
    }

    public abstract void evadeAction();

    //武器有很多选择要单独列出来

    public void mountWeapon(EnergyWeapon weapon)
    {
        System.out.println("武器进行装备");
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "callsign='" + callsign + '\'' +
                ", shield=" + shield +
                ", weapon=" + weapon +
                '}';
    }
}
