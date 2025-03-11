package hometest.comparator;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person p1 =new Person("张三",32);
        Person p2 =new Person("李四",27);

        Comparator<Person> comparator = new PersonComparator() ;
        System.out.println(comparator.compare(p1,p2));

        Comparator<Person> comparator1 = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                if(o1.age > o2.age){
                    return 1;
                }else if(o1.age == o2.age){
                    return 0;
                }
                return -1;
            }
        };

        Comparator<Person> comparator3 = (o1,o2) ->{return o1.age>o2.age ?1:o1.age == o2.age?0:-1;};


    }
}
