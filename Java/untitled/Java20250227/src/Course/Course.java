package Course;

public class Course {

    public String name;
    public String numbers;
    public int score;

    public Course(String name,String numbers,int score)
    {
        this.name = name;
        this.numbers = numbers;
        this.score = score;
    }
    public void show()
    {
        System.out.println("课程名："+this.name);
        System.out.println("课程号："+this.numbers);
        System.out.println("课程成绩："+this.score);
    }
}
