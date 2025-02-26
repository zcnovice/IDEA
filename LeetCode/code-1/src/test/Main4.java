package test;

import java.util.ArrayList;

public class Main4 {
     /*    给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
    请你找出并返回这两个正序数组的 中位数 。
    算法的时间复杂度应该为 O(log (m+n)) 。

    示例 1：
    输入：nums1 = [1,3], nums2 = [2]
    输出：2.00000
    解释：合并数组 = [1,2,3] ，中位数 2

    示例 2：

    输入：nums1 = [1,2], nums2 = [3,4]
    输出：2.50000
    解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5*/

    //测试代码
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 6, 7};
        int[] num1 = {3, 4 , 9};

        //数组一旦创建就不可改变，因此用ArrayList
        ArrayList<Integer> array = new ArrayList<>();
        int i = 0, j = 0;

        // 合并两个数组
        while (i < num.length && j < num1.length) {
            if (num[i] < num1[j]) {
                array.add(num[i]);
                i++;
            } else {
                array.add(num1[j]);
                j++;
            }
        }

        // 添加剩余的元素
        while (i < num.length) {
            array.add(num[i]);
            i++;
        }

        while (j < num1.length) {
            array.add(num1[j]);
            j++;
        }

        //System.out.println(array);
        Double d;
        int s = array.size();   //1 2 3 6 7
        if (s % 2 == 0) {
            int e = s / 2;
            double ss = array.get(e - 1) + array.get(e);
            d = ss / 2;
        } else {
            int e = s / 2;
            d = Double.valueOf(array.get(e));
        }

        System.out.println(d);
    }

}
