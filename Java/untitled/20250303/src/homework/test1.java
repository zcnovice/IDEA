package homework;

public class test1 {
    public static void main(String[] args) {
        int[] nums = {95,92,75,56,98,71,80,58,91,91};
        int avg = getAvg(nums);
        System.out.println(avg);
        int d = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]>avg)
            {
                d++;
            }
        }
        System.out.println("高于平均分："+avg+"的个数有"+d+"个");
    }

    public static int getAvg(int [] nums)
    {
        int sum = 0;
        for(int i= 0;i<nums.length;i++)
        {
            sum += nums[i];
        }
        return sum/nums.length;
    }
}
