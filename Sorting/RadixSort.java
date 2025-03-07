

import java.util.Arrays;

public class RadixSort
{
    public static void main(String[] args)
    {
        int[] arr = {29,83,471,36,91,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr)
    {
        int max = Arrays.stream(arr).max().getAsInt();

        for (int i = 1; max/i > 0 ; i*=10)
        {
            countSot(arr,i);
        }
    }

    private static void countSot(int[] arr,int exp)
    {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        Arrays.fill(count,0);

        for(int i = 0; i < n; i++)
        {
            count[(arr[i]/exp) % 10]++;
        }

        System.out.println("Count array for " + exp + " : " + Arrays.toString(count));

        for (int i = 1 ; i < 10; i++)
        {
            count[i] = count[i] + count[i-1];
        }

        System.out.println("Updated Count array " + exp + " : " + Arrays.toString(count));

        for(int i=n-1;i>=0;i--)
        {
            output[count[(arr[i]/exp) % 10]-1] = arr[i];
            count[(arr[i]/exp) % 10]--;
        }
        System.arraycopy(output,0,arr,0,n);
    }
}