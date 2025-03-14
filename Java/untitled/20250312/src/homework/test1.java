package test;

import java.util.*;

public class test1 {
    public static Map<String, Integer> listTest(List<String> list, Collection<String> targets) {
        Map<String, Integer> result = new HashMap<>();
        for (String target : targets) {
            // 直接统计每个目标元素的出现次数
            int count = Collections.frequency(list, target);
            result.put(target, count);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "a", "c", "b");
        Collection<String> targets = Arrays.asList("a", "b", "c", "xxx");
        System.out.println(listTest(list, targets));
        // 输出：{a=2, b=2, c=1, xxx=0}
    }

}
