package Game;

//战士
public class Warrior extends GameCharacter{

    //子类必须实现父类抽象方法，与父类定义的带参构造方法

    //起始本身就是要实现父类构造方法的，只不过是无参构造---用super（）实现
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void performAttack(GameCharacter gameCharacter) {
        //具体实现攻击方法

    }
}
