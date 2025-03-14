package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class exercise4 {
    public static void main(String[] args) {
        String[] str = {"黑龙江省","浙江省","江西省","广东省","福建省"};

        String[] str2 = {"哈尔滨","杭州","南昌","广州","福州"};

        Map<String,String> map = new HashMap<>();

        Print(map);
    }

    private static void Print(Map<String, String> map) {
        Set<Map.Entry<String,String>> entries1 = map.entrySet();
        for(Map.Entry<String,String> entry :entries1)
        {
            String i =  entry.getKey();
            String s =   entry.getValue();

            System.out.println(i+" = "+s);
        }
    }
}
