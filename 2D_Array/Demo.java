import java.util.Scanner;
//hello
public class Demo {
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

        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
