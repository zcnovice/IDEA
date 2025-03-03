package homework;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //S = 1! + 2! + 3! + ...+n!
        int n = sc.nextInt();
        //n!
        int sum = 1;

        int cont = 0;
        for(int i = 1;i<=n;i++)
        {
            for (int j = 1;j<=i;j++)
            {
                sum *= j;
            }
            cont += sum;
            sum = 1;
        }
        System.out.println(cont);
    }
}
