import java.util.Scanner;

public class FindElementInAnArray {

    public static int findingelement(int arr[], int n, int find) {
        for (int i = 0; i < n; i++)
        {
            if (find == arr[i])
            {
                return i;
            }
        }
    
        return -1;
    }

    public static void main(String[] args) {
        int n;
        int find;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        find = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt(); 
        }

        int resuult = findingelement(arr, n, find);
        System.out.println(resuult);
    }
}
