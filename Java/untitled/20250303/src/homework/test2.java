package homework;

public class test2 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] num2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Print(num1);
        Print(num2);
        System.out.println("是否一致："+equals(num1, num2));
    }

    /**
     * 判断两个数组是否一致
     * @param num1
     * @param num2
     * @return
     */
    public static boolean equals(int[] num1, int[] num2) {
        if (num1.length != num2.length) {
            return false;
        }
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != num2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 打印数组
     * @param num
     */
    public static void Print(int [] num){
        for(int number:num)
        {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
