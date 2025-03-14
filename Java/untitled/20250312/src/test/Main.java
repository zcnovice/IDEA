package test;

import java.util.ArrayList;
import java.util.Iterator;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Date");
        arr.add("Elderberry");

        //注意怎么使用迭代器   不是用new
        //注意迭代器要定义变量类型<String>
        Iterator<String> iterator = arr.iterator();

        Print(iterator);

        iterator = arr.iterator();
        while(iterator.hasNext())
        {
            String s = iterator.next();
            if(s.length() > 5)
            {
                iterator.remove();
            }
        }
        System.out.println("==================");
        iterator = arr.iterator();

        Print(iterator);
    }

    public static void Print(Iterator<String> iterator)
    {
        while(iterator.hasNext())
        {
            //要重新定义一个变量来获取
            //iterator = iterator.next();
            String s = iterator.next();
            System.out.println("Element:"+s);
        }
    }
}