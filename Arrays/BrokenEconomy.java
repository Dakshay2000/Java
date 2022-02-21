import java.util.Scanner;

public class BrokenEconomy {
    public static void Binary(int n, int key, int arr[], int floor, int ceil) {
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
    }

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

        Binary(n, key, arr, floor, ceil);

        System.out.println(floor);
        System.out.println(ceil);
        
        
    }
}
