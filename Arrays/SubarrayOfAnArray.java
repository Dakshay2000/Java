import java.util.Scanner;

public class SubarrayOfAnArray {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt(); 
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = i; j < n; j++) 
            {
                for (int k = i; k <= j; k++) 
                {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}
