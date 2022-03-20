import java.util.Scanner;

public class LastIndex {
    public static int Last(int n, int arr[], int key, int index) 
    {
        if (index < 0) 
        {
            return -1;
        }    

        if (arr[index] == key) 
        {
            return index;
        }
        return Last(n, arr, key, index - 1);
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
        int index = arr.length - 1;

        System.out.println(Last(n, arr, key, index));
    }
}
