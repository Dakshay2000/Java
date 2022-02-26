import java.util.Scanner;

public class Rotate90 {
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

        //Transposing Matrix
        for (int i = 0; i < n; i++) 
        {
            for (int j = i; j < m; j++) 
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }   
        }

        //Arranging columns here 
        int left = 0;
        int right = n-1;
        while(left < right)
        {
            for(int row = 0; row < arr.length; row++)
            {
                int temp = arr[row][left];
                arr[row][left] = arr[row][right];
                arr[row][right] = temp;
            }
            left++;
            right--;
        }

        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
