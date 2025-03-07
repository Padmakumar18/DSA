

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) 
    {
        int[] arr = {5,8,9,2,4,8,10,2,1};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection_sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int index = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[j]<arr[index])
                {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
