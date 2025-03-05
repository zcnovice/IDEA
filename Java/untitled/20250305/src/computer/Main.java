package computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Lenovo();
        //computer.test();
        Lenovo lenovo = (Lenovo) computer;
        lenovo.test();


        lenovo.Ctest();
    }
}
