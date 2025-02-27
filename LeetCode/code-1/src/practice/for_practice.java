package practice;

import java.util.*;

public class for_practice {
    public static void main(String[] args) {
        //增强for循环
        int[] arr = {1,2,3,4,5};
        /*for (char c : characters) {
            System.out.println(c);
        }

        // 使用普通的for循环遍历字符数组
        for (int i = 0; i < characters.length; i++) {
            char c = characters[i];
            System.out.println(c);
        }*/

        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        for(int i : arr)
        {
            System.out.println(i);
        }

        //-----------------------增强for循环练习--------------------------
        int[] nums = {1, 2, 3, 4, 5};
        for (int num : nums) {
            System.out.println(num);
        }

        for(int i = 0;i<nums.length ;i++)
        {
            System.out.println(nums[i]);
        }

        //-----------------------增强for循环练习--------------------------
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }

        for(int i = 0;i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }



        //-----------------------增强for循环练习--------------------------
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (int number : numbers) {
            System.out.println(number);
        }

        //-----------------------增强for循环练习--------------------------
        int[] numbers1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

        for(int num : numbers1)
        {
            System.out.println(num);
        }

        //-----------------------增强for循环练习--------------------------
        List<String> names1 = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        for (int i = 0; i < names1.size(); i++) {
            String name = names1.get(i);
            System.out.println(name);
        }


        for(String ss : names1)
        {
            System.out.println(ss);
        }





        //-----------------------增强for循环练习--------------------------
        Set<Integer> scores = new HashSet<>(Arrays.asList(90, 85, 95));
        Iterator<Integer> iterator = scores.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }

}
