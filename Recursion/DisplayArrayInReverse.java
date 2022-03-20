public class DisplayArrayInReverse {
    public static void display(int arr[], int n) 
    {
        if (n == arr.length) 
        {
            return;
        }    

        display(arr, n+1);
        System.out.println(arr[n]);
    }
    public static void main(String[] args) 
    {
        int arr[] = {10,30,50,20,40};
        int n = 0;
        display(arr, n);
    }
}
