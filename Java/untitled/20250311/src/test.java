public class test {
    public static void main(String[] args) {
        System.out.println(ss());
    }

    public static int ss()
    {
        try{
            System.out.println("xxx");
            return 1;
        }catch (Exception e) {
            return 2;
        }finally {
            return 3;
        }
    }
}
