package test;

public class Test5 {
    public static void main(String[] args) {
        int[] num = {21,35,24,12,45,55,78,23,2};
        //简单选择排序
        //paixUnits(num);


        //冒泡排序
        Bubble_Sort(num);
        Print(num);

    }


    public static int[] Selection_Sort(int[] num)
    {
        //简单选择排序
        for(int j= 1;j<num.length;j++)
        {
            for (int i = j;i<num.length;i++)
            {
                if(num[j-1]<num[i])
                {
                    int temp = num[j-1];
                    num[j-1] = num[i];
                    num[i] = temp;
                }
            }
        }
        return num;
    }

    public static int[] Bubble_Sort(int[] num)
    {
        //冒泡排序
        for(int i = 1;i<num.length;i++)
        {
            for(int j = 0;j<num.length-i;j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return num;
    }


    public static void Print(int[] num)
    {
        for(int num1 :num)
        {
            System.out.print(num1 +" ");
        }
    }

}
