package homework;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int index = in.nextInt();
        int sum = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(index+30 >= nums[i])
            {
                sum++;
            }
        }
        System.out.println(sum);

    }
}
