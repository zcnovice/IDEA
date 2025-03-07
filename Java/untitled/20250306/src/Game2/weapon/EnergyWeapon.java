package Game2.weapon;

public interface EnergyWeapon {
    void chargeEffect();   // 充能特效
    int fire();            // 返回伤害值
    void cooldown();       // 攻击后冷却
}
