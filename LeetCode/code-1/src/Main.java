import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
//    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target
//    的那 两个 整数，并返回它们的数组下标。
//    你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
//    你可以按任意顺序返回答案。

    //测试代码
    public static void main(String[] args) {

        //int [] nums = {2,3,7,11,15};
        int target = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int n = sc.nextInt();
        System.out.println("输入数组元素：");
        int [] nums = new int[n];
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            nums[i] = num;
        }
        System.out.println("输入目标数：");
        target = sc.nextInt();

        for(int i = 0;i< nums.length;i++)
        {
            for(int j= i+1;j< nums.length;j++)
            {
                int t = nums[i]+nums[j];
                if(t==target)
                {

                }
            }
        }
    }


    //完全体答案
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int [] result = new int[2];
            for(int i = 0;i< nums.length;i++)
            {
                for(int j= i+1;j< nums.length;j++)
                {
                    int t = nums[i]+nums[j];
                    if(t==target)
                    {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
            return result;
        }
    }

}