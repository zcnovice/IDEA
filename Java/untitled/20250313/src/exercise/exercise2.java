package exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class exercise2 {
    public static void main(String[] args) {
        Map<Car,Integer> cars = new HashMap<>();
        Car car1 = new Car("xiaomo SU7","XiaoMI");
        Car car2 = new Car("xiaomo SU7 U","XiaoMI");

        cars.put(car1,299900);
        cars.put(car2,529900);

        Set<Map.Entry<Car,Integer>> entries = cars.entrySet();
        for(Map.Entry<Car,Integer> entry :entries)
        {
            Car car = entry.getKey();
            Integer price = entry.getValue();

            System.out.println(car);
            System.out.println(price);
        }


        //遍历key 在根据key遍历value
        //Set<K> keySet();//获取集合中键的集合
        Set<Car> keys = cars.keySet();

        for(Car key : keys)
        {
            //遍历key   来取出value
            Integer value = cars.get(key);
            System.out.println("key:"+key +"value:"+ value);
        }
    }
}
