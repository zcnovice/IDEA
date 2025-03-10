package homework;

public class test5 {
    public static void main(String[] args) {
        String str = "523201200909082243";
        String date = str.substring(6,14);
        System.out.println("出生日期为："+date);

        String sex = str.substring(16,17);
        Integer sex1 = Integer.valueOf(sex);

        if(sex1 % 2 == 0)
        {
            System.out.println("性别为女");
        }
        else{
            System.out.println("性别为男");
        }
    }
}
