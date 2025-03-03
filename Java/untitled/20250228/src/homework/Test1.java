package homework;

public class Test1 {
    public static void main(String[] args) {
        //0~100的质数
        int d = 0;
        for(int i = 2;i<=100;i++)
        {
            for(int j = 2;j<i;j++)
            {
                if(i%j == 0)//17
                {
                    d++;
                    break;
                }

            }
            if(d == 0)
            {
                System.out.println(i+"是一个质数");

            }
            d = 0;

        }
    }
}