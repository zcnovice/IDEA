package test;

public class test1 {
    public static void main(String[] args) {
        int[] nams = new int[5];

        int[][] num = new int[5][3];

        int [][] nums = {{2,46,89,1,2}, {4,23,23,2,2}, {2,2,2,2,2}};

        for(int i = 0; i < num.length; i++)
        {
            //System.out.println(num[i]);
        }
        //System.out.println(num);

        for(int[] num1 : nums)
        {
            for(int num2 : num1)
            {
                System.out.print(num2);
            }
            System.out.println();
        }
    }
}
