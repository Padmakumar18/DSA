package DSA.BinarySearch;

public class Floor
{
    public static void main(String[] args) 
    {
        int[] arrAsc = {2, 3, 5, 9, 14, 15, 16, 18};
        int[] arrDsc = {18, 16, 15, 14, 9, 5, 3, 2};
        int target = 8;
        System.out.println(Floor_Asc(target,arrAsc));
        System.out.println(Floor_Dsc(target,arrDsc));
    }
    public static int Floor_Asc(int target , int[] arr)
    {
        if(target<arr[0])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid]>target)
             end=mid-1;
            else if(arr[mid]<target)
             start=mid+1;
            else
             return mid;
        }
        return end;
    }
    public static int Floor_Dsc(int target , int[] arr)
    {
        if(target<arr[arr.length-1])
        {
            return -1;
        }
       
        int start =0;
        int end=arr.length;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]<target)
             end=mid-1;
            else if(arr[mid]>target)
             start=mid+1;
            else
             return mid;
        }
        return start;
    }
}
