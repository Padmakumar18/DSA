public class BinarySearch {
    public static void main(String[] args) 
    {
        int[] arrAsc = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arrDsc = {89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18};
        int target = 16;
        System.out.println(Binary_Search_Asc(target,arrAsc));
        System.out.println(Binary_Search_Dsc(target,arrDsc));
    }

    public static int Binary_Search_Asc(int target , int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]>target)
             end=mid-1;
            else if(arr[mid]<target)
             start = mid+1;
            else
             return mid;
        }
        return -1;
    }

    public static int Binary_Search_Dsc(int target , int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]>target)
            start = mid+1;
            else if(arr[mid]<target)
             end=mid-1;
            else
             return mid;
        }
        return -1;
    }
}
