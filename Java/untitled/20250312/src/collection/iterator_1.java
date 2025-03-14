package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator_1 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // 使用迭代器遍历
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if(fruit == "apple")
            {
                fruits.remove(fruit);
            }
            System.out.println(fruit);
        }
    }
}
