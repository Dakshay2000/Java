import java.util.Scanner;

public class AllIndicesOfArray_Optimised {
    public static int allIndices(int arr[], int x, int idx, int fsf) 
    {
        if (idx == arr.length) 
        {
            return new int[fsf]; //New Array Created here
        }    

        if (arr[idx] == x) 
        {
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        }

        else{
            int[] iarr = allIndices(arr, x, idx + 1, fsf);
            return iarr;
        }
    }

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int idx = 0;
        int fsf = 0;

        System.out.println(allIndices(arr, x, idx, fsf));
    }
}
