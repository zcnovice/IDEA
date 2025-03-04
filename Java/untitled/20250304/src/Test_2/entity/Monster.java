package Test_2.entity;

public class Monster {
    private String name;
    private int HP;
    private int attack;

    public Monster() {
    }

    public Monster(String name, int HP, int attack) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
