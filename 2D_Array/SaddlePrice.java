import java.util.Scanner;

public class SaddlePrice {
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

        for (int i = 0; i < n; i++) 
        {
            int colno = 0;
            int min = arr[i][0];
            for (int col = 1; col < n; col++) 
            {
                if (arr[i][col] < min) 
                {
                    min = arr[i][col];
                    colno = col;
                }
            }

            boolean ans = true;
            for (int row = 0; row < n; row++) 
            {
                if (arr[row][colno] > min) 
                {
                    ans = false;
                    break;
                }
            }

            if(ans == true)
            {
                System.out.println(min);
                return;
            }
        }
        System.out.println("Invalid Input");
    }
}
