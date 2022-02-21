import java.util.Scanner;

public class BrokenEconomy {
    //We cannot print value of floor and ceil by calling another function because another function cannot update the value of a variable(because value in variable pass by "call by value").
    //In array "call by reference works" and array can be update through calling another function.

    public static void main(String[] args) {
        int n;
        int key;
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        key = scn.nextInt();
        int floor = -1;
        int ceil = -1;
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt(); 
        }

        int start = 0;
        int end = n;
        
        while (start <= end) 
        {
            int mid = (start + end)/2;

            if(arr[mid] == key)
            {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }

            else if(arr[mid] < key)
            {
                floor = arr[mid];
                start = mid + 1;
            }

            else
            {
                ceil = arr[mid];
                end = mid - 1;
            }
        }

        System.out.println(floor);
        System.out.println(ceil);
    }
}
