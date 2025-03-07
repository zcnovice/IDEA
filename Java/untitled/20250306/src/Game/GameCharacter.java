package Game;

import Game.Weapon.Weapon;

public abstract class GameCharacter {
    protected String name;
    protected int health;
    protected Weapon weapon;

    public abstract void performAttack(GameCharacter gameCharacter);

    public void equipWeapon(Weapon weapon){
        System.out.println("装备武器");
        //怎么用代码实现装备武器？
        this.weapon = weapon;
    }

    //武器可以单独装备，暂时不用写进构造函数
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    //为什么要在父类里面写构造函数，这样后面子类就不用重复写了


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "职业='" + name + '\'' +
                ", 剩余生命值=" + health +
                '}';
    }

}
