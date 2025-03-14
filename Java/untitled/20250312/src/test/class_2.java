package test;

import java.util.ArrayList;
import java.util.List;

public class class_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(23);
        list.add(44);
        list.add(22);
        list.add(56);
        list.add(21);


        int max = 0;
        for(int i= 0;i< list.size();i++)
        {
            if(list.get(i) > max)
            {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
