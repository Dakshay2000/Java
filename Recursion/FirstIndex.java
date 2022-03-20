import java.lang.reflect.Array;
import java.util.Scanner;

public class FirstIndex {
    public static int First(int n, int arr[], int key, int index) 
    {
        if (index == n) 
        {
            return -1;
        }    

        if (arr[index] == key) 
        {
            return index;
        }
        return First(n, arr, key, index + 1);
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
        int key = scn.nextInt();
        int index = 0;

        System.out.println(First(n, arr, key, index));
    }
}
