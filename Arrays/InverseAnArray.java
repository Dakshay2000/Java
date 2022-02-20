import java.util.Scanner;

public class InverseAnArray {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt(); 
        }

        int []inv = new int[n];

        for (int i = 0; i < n; i++) 
        {
            int k = arr[i];
            inv[k] = i;
        }

        for(int i = 0; i < n; i++) 
        {
            System.out.print(inv[i]);
        }
    }
}
