

import java.util.Arrays;

public class CyclicSort
{
    public static void main(String[] args)
    {
        int[] arr = {7,6,5,4,3,2,1};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void fun(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        {
            int crt = arr[i] -1;
            if(arr[crt] != arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[crt];
                arr[crt] = temp;
            }
            else
            {
                i++;
            }
        }
    }
}
