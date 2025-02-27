package Extend;

public abstract class Child extends Father{


    public void show(){
        System.out.println("Child"+name);
        Show();
    }

    @Override
    public void Show() {
        super.Show();
    }
}
