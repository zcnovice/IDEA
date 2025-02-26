package test;

public class Main9 {


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
