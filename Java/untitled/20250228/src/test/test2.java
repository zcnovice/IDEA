package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = sc.nextInt();
        }
//====================下面为增强for循环=====================
        int index = 0;
        for (int num : nums) {
            nums[index++] = sc.nextInt();
        }

        for (int num1 : nums)
        {
            System.out.println(num1);
        }
    }
}
