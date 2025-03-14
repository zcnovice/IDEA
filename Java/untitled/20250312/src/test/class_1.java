package test;

import java.util.ArrayList;
import java.util.List;

public class class_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("2");
        list.add("1");
        list.add("5");
        list.add("8");
        list.add("9");


        List<String> newList = new ArrayList<>();
        String s = list.get(0);
        newList.add(s);
        int num = 0;
        for(int i = 1;i<list.size();i++)
        {
            for(int j = 0;j<newList.size();j++)
            {
                if(list.get(i) == newList.get(j))
                {
                    num++;
                }
            }
            if(num==0)
            {
                String w = list.get(i);
                newList.add(w);
            }
            num = 0;
        }


    }


    public static void s(List<String> list)
    {
        List<String> LastList = new ArrayList<>();
        String s = list.get(0);
        LastList.add(s);
        int ss = 0;
        for(int i = 1;i< list.size();i++)
        {
            for(int j = 0;j<LastList.size();j++)
            {
                if(list.get(i) == LastList.get(j))
                {
                    ss += 1;
                }
            }
            if(ss == 0)
            {
                LastList.add(list.get(i));
            }
            ss = 0;
        }
    }


}
