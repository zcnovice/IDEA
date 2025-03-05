package test2;

public class Parent extends Grandpa{
    String name = "Parent";


    String getGrandpaName() {
        return super.name;
    }
    @Override
    void print() {
        System.out.println("Parent's print()");
    }
}
