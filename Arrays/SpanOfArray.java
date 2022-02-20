import java.util.Scanner;

//Difference of maximum and minimum value
public class SpanOfArray {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt(); 
        }

        int maxx;
        int minn;
        int finalmaxx = Integer.MIN_VALUE;
        int finalminn = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            maxx = arr[i];
            minn = arr[i];
            finalmaxx = Math.max(finalmaxx, maxx);
            finalminn = Math.min(finalminn, minn);
        }
        

        int result = finalmaxx - finalminn;
        System.out.println(result);
    }
}
