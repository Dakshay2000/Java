import java.util.Scanner;

public class RotateAnArray {

    public static void Reverse(int arr[], int k, int n) {
        //This function is for reversing the array
        while(k < n)
        {
            int temp = arr[k];
            arr[k] = arr[n];
            arr[n] = temp;

            k++;
            n--;
        }
    }

    public static void main(String[] args) {
        int n;
        int k;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Value for n");
        n = scn.nextInt();
        System.out.println("Enter Value for k");
        k = scn.nextInt();
        System.out.println("Enter Elements Of Array");
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt(); 
        }


        //For K greater than n or less than 0
        k = k%n;
        if(k < 0)
        {
            while(k < 0)
            {
                k = k + n;
            }
        }

        //First we have to reverse the whole array then we will reversing 0th element to k-1th element and then kth element to n-1th element.
        Reverse(arr, 0, n-1);
        Reverse(arr, 0, k-1);
        Reverse(arr, k, n-1);

        for(int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]);
        }
    }
}
