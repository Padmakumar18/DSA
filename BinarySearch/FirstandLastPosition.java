package DSA.BinarySearch;

import java.util.Arrays;

public class FirstandLastPosition 
{
    public static void main(String[] args) {
        int[] arrAsc = {2, 3, 3, 5, 9, 9, 15, 15, 18,18};
        // int[] arrDsc = {18, 18, 16, 16, 15, 15, 9, 3, 3, 2};
        int target = 9;
        int[] ans1 = searchRange(arrAsc, target);
        // int[] ans2 = searchRange(arrDsc, target);
        System.out.println(Arrays.toString(ans1));
        // System.out.println(Arrays.toString(ans2));
    }
    public static int[] searchRange(int[] arr,int target)
    {
        int[] ans = {-1,-1};
        ans[0] = FirstandLastPosition_Asc(target, arr, true);
        if(arr[0] !=-1)
        {
            ans[1]=FirstandLastPosition_Asc(target, arr, false);
        }
        return ans;
    } 
    public static int FirstandLastPosition_Asc(int target ,int[] arr,boolean flag)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(target<arr[mid])
            {
                end = mid - 1;                   
            }
            else if(target > arr[mid])
            {
                start = mid + 1;               
            }
            else
            {
                ans = mid;
                if(flag)
                {
                    end  = mid -1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static int FirstandLastPosition_Dsc(int target , int[] arr,boolean flag)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end - start)/2;
            if(target<arr[mid])
            {
                start = mid + 1;
            }
            else if(target > arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                ans = mid;
                if(flag)
                {
                    start = mid + 1;
                }
                else
                {                    
                    end  = mid -1;
                }
            }
        }
        return ans;
    }
}
