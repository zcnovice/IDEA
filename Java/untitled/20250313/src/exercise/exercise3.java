package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class exercise3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        Print(map);

        map.put(5,"李晓红");

        map.remove(1);

        map.put(2,"周玲");
        System.out.println("================================================");
        Print(map);
    }

    private static void Print(Map<Integer, String> map) {
        Set<Map.Entry<Integer,String>> entries1 = map.entrySet();
        for(Map.Entry<Integer,String> entry :entries1)
        {
            Integer i =  entry.getKey();
            String s =   entry.getValue();

            System.out.println("Key:"+i+" , value:"+s);
        }
    }
}
