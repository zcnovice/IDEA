package Course;

public class CourseTest {
    public static void main(String[] args) {
        int []num = new int[3];
        Course []courses = new Course[3];
        courses[0] = new Course("Java","1,2,3",100);
        courses[1] = new Course("C++","4,5,6",120);
        courses[2] = new Course("Python","7,8,9",150);


        courses[0].show();



    }
}
