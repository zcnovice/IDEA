package test1;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        LinkedList<String>  link = new LinkedList<>();

        link.add("ddfghh");
        link.add("yurwoo");

        System.out.println(link.get(1));

        Set<User> s = new HashSet<>();
        User user1 = new User(17,"sss");
        User user2 = new User(47,"www");
        User user3 = new User(47,"www");
        s.add(user1);
        s.add(user2);
        s.add(user3);
        System.out.println(s);



        Set<String> s1 = new TreeSet<>();
        s1.add("dfg");
        s1.add("dfe");
        s1.add("asd");
        System.out.println(s1);


    }
}
