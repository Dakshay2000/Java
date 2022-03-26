import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> Try = new ArrayList<>();

        for (int i = n-1; i >= 0; i--) 
        {
            Try.add(arr[i]);
        }

        System.out.println(Try);
    }
}
