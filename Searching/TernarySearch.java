public class TernarySearch 
{
    public static void main(String[] args) 
    {
        System.out.println();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int left = 0;
        int rigth = arr.length-1;
        int target = 8;

        System.out.println(ternarySearch(left,rigth,target,arr));
    }

    public static int ternarySearch(int left,int rigth,int target,int[] arr)
    {
        int start = left;
        int end = rigth;
        if(start <= end)
        {
            int mid1 = start + (end - start) /3; 
            int mid2 = end - (end - start) /3; 

            if(target == arr[mid1])
            {
                return mid1 ;
            }
            if(target == arr[mid2])
            {
                return mid2 ;
            }

            if(target < arr[mid1])
            {
                return ternarySearch(left, mid1-1, target, arr);
            }
            else if(target > arr[mid2])
            {
                return ternarySearch(mid2 + 1, rigth, target, arr);
            }
            else
            {
                return ternarySearch(mid1+1, mid2-1, target, arr);
            }
        }
        return -1;
    }
}
