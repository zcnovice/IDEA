package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        // 任务1：初始化ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("初始列表: " + fruits);

        // 任务2：迭代器遍历
        Iterator<String> iterator = fruits.iterator();
        System.out.println("\n遍历列表:");
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // 任务3：删除长度>5的元素
        iterator = fruits.iterator(); // 重新获取迭代器
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.length() > 5) {
                iterator.remove();
            }
        }
        System.out.println("\n删除后的列表: " + fruits);

        // 任务4：触发ConcurrentModificationException（可选）
        try {
            iterator = fruits.iterator();
            while (iterator.hasNext()) {
                String fruit = iterator.next();
                if (fruit.equals("Date")) {
                    fruits.remove(fruit); // 错误操作！
                }
            }
        } catch (Exception e) {
            System.out.println("\n捕获异常: " + e);
        }
    }
}
