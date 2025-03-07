

import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        int[] arr = {5,8,9,2,4,8,10,2,1};
        arr=merge_sort(arr);
        System.out.println(Arrays.toString(arr));
        
        merge_sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] merge_sort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = merge_sort(Arrays.copyOfRange(arr,0, mid));
        int[] right = merge_sort(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left,right);
    }

    public static int[] merge(int[] first,int[] second)
    {
        int[] mergeArray = new int[first.length + second.length];
        int i=0,j=0,k=0;

        while (i<first.length && j<second.length) 
        {
            if(first[i]<second[j])
            {
                mergeArray[k++] = first[i++];
            }
            else
            {
                mergeArray[k++] = second[j++];
            }
        }
        while (i<first.length) 
        {
            mergeArray[k++]=first[i++];            
        }
        while (j<second.length) 
        {
            mergeArray[k++]=second[j++];            
        }
        return mergeArray;
    }

    public static void merge_sort(int[] arr,int start,int end)
    {
        if(end - start == 1)
        {
            return ;
        }

        int mid = start + (end - start)/2;

        merge_sort(arr, start,mid);
        merge_sort(arr, mid,end);

        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr,int start,int mid,int end)
    {
        int[] mergeArray = new int[end-start];
        int i=start,j=mid,k=0;

        while (i<mid && j<end) 
        {
            if(arr[i]<arr[j])
            {
                mergeArray[k++] = arr[i++];
            }    
            else
            {
                mergeArray[k++] = arr[j++];
            }
        }

        while (i<mid) 
        {
            mergeArray[k++] = arr[i++];
        }
        while (j<end) 
        {
            mergeArray[k++] = arr[j++];
        }

        for (k = 0 ;k< mergeArray.length ; k++) 
        {
            arr[start+k] = mergeArray[k];
        }
    }
}