public class Single {
/*    private static final Single s = new Single();

    private Single() {

    }

    public static Single getInstance()
    {
        return s;
    }*/

    private  static Single ss;

    private Single()
    {

    }

    public static Single getInstance()
    {
        if(ss == null)
        {
            ss = new Single();
        }
        return ss;
    }

}
