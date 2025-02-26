import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
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

        int [] num = {1,2};
        int [] num1 = {3,4};

        //数组一旦创建就不可改变，因此用ArrayList
        ArrayList<Integer> array = new ArrayList<>();
        int j = 0;
        for(int i = 0;i+j<num.length+ num1.length;)
        {

            if(num[i] < num1[j])
            {
                array.add(num[i]);
                i++;
                if(i>=num.length)
                {
                    array.add(num1[j]);
                    j++;
                }
            }else {
                array.add(num1[j]);
                j++;

                if(j >= num1.length)
                {
                    if(i<num.length)
                    {
                        array.add(num[i]);
                    }
                    //array.add(num[i+1]);
                    i++;
                }
            }
        }

        System.out.println(array);
        Double d;
        int s = array.size();   //1 2 3 6 7
        if(s%2 == 0)
        {
            int e = s/2;
            double ss = array.get(e-1)+array.get(e);
            d = ss/2;
        }
        else {
            int e = s/2;
            d = Double.valueOf(array.get(e));
        }

        System.out.println(d);

    }






/*    罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。

    字符          数值
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

    通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
    同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
    给定一个罗马数字，将其转换成整数。*/


/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入罗马数字：");
        String text = sc.nextLine();

        char[] characters = text.toCharArray();

        for (char c : characters) {
            System.out.println(c);
        }

    }*/

    class Solution {


    }

}