
import java.util.Arrays;
public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] arr = {5,8,69,2,4990,8,107,2,10000};
         System.out.println(Arrays.toString(kunal(arr)));
    }

    public  static int[] insertion_sort(int[] arr)
    {
        for (int i=1;i<arr.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                    break;
            }
        }
        return  arr;
    }

    public  static int[] insertion_sort_usingRecurson(int[] arr,int start)
    {
        if(start == arr.length)
        {
            return arr;
        }

        for(int j=start;j>0;j--)
        {
            if(arr[j] < arr[j - 1])
            {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }

        insertion_sort_usingRecurson(arr,start+1);
        return  arr;
    }

    public static int[] kunal(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                    break;
            }
        }
        return arr;
    }
}