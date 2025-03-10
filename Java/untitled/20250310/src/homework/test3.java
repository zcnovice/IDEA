package homework;

import java.util.Scanner;

public class test3 {
    private static final String[] CHINESE_NUMBERS = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    private static final String[] UNITS = {"", "拾", "佰", "仟", "万", "拾万", "佰万", "仟万"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个七位以内的整数: ");
        int number = scanner.nextInt();
        // 转换为中文
        String result = convertToChinese(number);
        System.out.println(result);
    }

    private static String convertToChinese(int number) {
        StringBuilder chineseNumber = new StringBuilder();
        String numStr = String.format("%07d", number); // 前面补0
        //System.out.println(numStr);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            if (digit >= 0) {
                chineseNumber.append(CHINESE_NUMBERS[digit]).append(UNITS[numStr.length() - 1 - i]);
            }
        }
        return chineseNumber.toString();
    }
}
