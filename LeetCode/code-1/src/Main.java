import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {

/*    给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，
    并且每个节点只能存储 一位 数字。
    请你将两个数相加，并以相同形式返回一个表示和的链表。
    你可以假设除了数字 0 之外，这两个数都不会以 0 开头。*/

    //测试代码
    public static void main(String[] args) {
        //ArrayList相当与时顺序表
        ArrayList list1 = new ArrayList<>();

        list1.add(2);
        list1.add(4);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(5);
        list2.add(6);
        list2.add(4);

        System.out.println(list1);
        int num = 0;
        for(int i = list1.size()-1;i>=0;i--)
        {
            int s1 = (int) list1.remove(i);
            num = num*10+s1;
            //System.out.println(s1);
        }

        System.out.println(num);

        int num2 = 0;
        for(int i = list2.size()-1;i>=0;i--)
        {
            int s1 = (int) list2.remove(i);
            num2 = num2*10+s1;
            //System.out.println(s1);
        }

        System.out.println(num2);

        int sum = num+num2;
        System.out.println(sum);

        //本题应该用链表

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