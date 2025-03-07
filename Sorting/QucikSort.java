
import java.util.Arrays;

public class QucikSort 
{
    public static void main(String[] args) {
        int[] arr = {5,8,9,2,4,8,10,2,1};
        Qucik_Sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Qucik_Sort(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }

        int start = low;
        int end = high;
        int pivot = arr[start+(end-start)/2];

        while (start<=end)
        {
            while (arr[start]<pivot)
            {
                start++;
            }
            while (arr[end]>pivot)
            {
                end--;
            }
            if(start<=end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        Qucik_Sort(arr, low, end);
        Qucik_Sort(arr, start, high);
    }
}