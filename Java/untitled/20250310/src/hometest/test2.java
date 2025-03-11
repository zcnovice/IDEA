package hometest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test2 {
    public static void main(String[] args) {
        Date beginTime = new Date();//获取系统当前的时间
        System.out.println(beginTime);


        //date.getTime() 从1970年1月1日0点0分到现在的毫秒数
        System.out.println(beginTime.getTime());

        Date date = new Date();
//        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String strDate = simpleDateFormat.format(date);//把日期转换固定格式的字符串

        System.out.println(strDate);
    }
}
