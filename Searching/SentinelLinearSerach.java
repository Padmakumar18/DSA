public class SentinelLinearSerach 
{
    public static void main(String[] args) 
    {
    System.out.println();
    int arr[] = { 10, 20, 180, 30, 60, 50, 110, 100, 70 };
    int n = arr.length;
    int key = 180;
    System.out.println(key+" is present at index "+SentinelSerach(arr, n, key));
    System.out.println(key+" is present at index "+SentinelSerach(arr, n, 1));
    }

    public static int SentinelSerach(int[] arr,int n,int key)
    {
        int lastElement = arr[n-1];
        int i = 0;
        arr[n-1] = key;

        while (arr[i]!=key)
        {
            i++;
        }

        arr[n-1] = lastElement;

        if((i<n-1) || (arr[n-1] == key))
        {
            return i;
        }

        return -1;
    }
}
