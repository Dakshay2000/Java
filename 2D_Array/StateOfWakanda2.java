import java.util.Scanner;

public class StateOfWakanda2 {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        m = scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int diag = 0; diag < n; diag++) 
        {
            int i = 0;
            int j = diag;
            while (i < n && j < n) 
            {
                System.out.println(arr[i][j]);
                i++;
                j++;
            }
        }
    }
}
