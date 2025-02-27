package test;

public class test1 {

    public static void main(String[] args) {
        final int N3 = 30;
        //N3 = 10;



        int number = 10;
        for (int i = 0; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    // 计算斐波那契数列的递归方法
    public static int fibonacci ( int n) {
        if (n == 0) { // 基准条件
            return 0;
        } else if (n == 1) { // 基准条件
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // 递归步骤
        }
    }
}
