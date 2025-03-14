package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class exercise1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"C++");
        map.put(3,"Python");

        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for(Map.Entry<Integer,String> entry : entrySet)
        {
            String value = entry.getValue();
            System.out.println(value);
        }
    }
}
