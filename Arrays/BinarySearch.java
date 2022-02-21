import java.util.Scanner;

public class BinarySearch {

    public static int Binary(int n, int f, int arr[]) {
        int start = 0;
        int end = n;
        
        while (start <= end) 
        {
            int mid = (start + end)/2;

            if(arr[mid] == f)
            {
                return mid;
            }

            else if(arr[mid] < f)
            {
                start = mid + 1;
            }

            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n;
        int f;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        f = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt(); 
        }

        int result = Binary(n, f, arr);

        System.out.println(result);
        
        
    }
}
