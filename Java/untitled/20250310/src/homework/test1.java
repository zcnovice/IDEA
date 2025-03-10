package homework;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,543,24};
        s(arr);

    }


    public static void s(int[] arr){
        String str = "[";
        for(int i = 0;i<arr.length;i++)
        {
            str += String.valueOf(arr[i]);
            if(i < arr.length-1)
            {
                str += ",";
            }
            if(i == arr.length-1)
            {
                str += "]";
            }
        }
        System.out.println(str);
    }
}
