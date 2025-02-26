import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {

/*    给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，
    并且每个节点只能存储 一位 数字。
    请你将两个数相加，并以相同形式返回一个表示和的链表。
    你可以假设除了数字 0 之外，这两个数都不会以 0 开头。*/

    //测试代码
    //public static void main(String[] args) {
        //链表

    //}







/*    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    例如，121 是回文，而 123 不是。*/

    public static void main(String[] args) {

        int x = 1234321;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        //     位数为偶                   位数为奇
        if(x == revertedNumber || x == revertedNumber / 10)
        {
            System.out.println("true");
        }
    }

    class Solution {

        //1234321
        public boolean isPalindrome(int x) {

        //   小于0有-号      最后一位不为0，应为最后一位是0则第一位也是0，不符合条件
            if(x<0 || (x!=0 && x%10==0))
            {
                return false;
            }

            //
            int num = 0;
            while(x>num)
            {
                //每次移动一位数到num上
                //如：第一次 x = 123432   num = 1
                //    第二次 x = 12343   num = 12
                num = num*10+x%10;
                x /= 10;

            }

            //判断返回
            return (x == num  || x == num/10 );
        }
    }

}