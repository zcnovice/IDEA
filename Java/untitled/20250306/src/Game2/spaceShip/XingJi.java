package Game2.spaceShip;

import Game2.weapon.EnergyWeapon;

public class XingJi extends SpaceShip{
    //闪避
    @Override
    public void evadeAction() {
        System.out.println("30%");
    }

    public XingJi(String callsign, int shield) {
        super(callsign, shield);
    }
}
