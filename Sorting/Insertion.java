import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = scn.nextInt();
        }

        for (int i = 1; i < n; i++) 
        {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) 
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]);
        }
    }
}
