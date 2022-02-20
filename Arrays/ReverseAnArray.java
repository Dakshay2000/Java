import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt(); 
        }

        int j = n - 1;
        for (int i = 0; i < n; i++) 
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            if (i > j) 
            {
                break;
            }
            j--;
        }

        for(int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]);
        }
    }
}
