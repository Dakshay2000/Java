import java.util.Scanner;

public class AllIndicesOfArray {
    public static void Indices(int n, int arr[], int key, int index) 
    {
        if (index == n) 
        {
            return;
        }    

        if (arr[index] == key) 
        {
            System.out.println(index);
        }
        Indices(n, arr, key, index + 1);
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

        Indices(n, arr, key, index);
    }
}
