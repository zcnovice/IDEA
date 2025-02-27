package homework;

public class test3 {
    public static void main(String[] args) {
        //猴子吃桃子，每一天吃前一天剩下桃子的一半加1个，到第10天（还没吃），还剩下一个桃子，问第一天有多少个桃子
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            sum = (sum + 1) * 2;
        }
        System.out.println(sum);
    }
}
