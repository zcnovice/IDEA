package test;

public class test6 {
    public static void main(String[] args) {
        System.out.println(Sum(1,2,3,4,5,6,7,8,9,10));
    }
    public static int Sum(int ... sum){
        int result = 0;
        //sum当数组用
        for (int i : sum) {
            result += i;
        }
        return result;
    }
}