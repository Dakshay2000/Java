public class MaxOfAnArray {
    public static int maxArray(int arr[], int n) 
    {
        if (n == arr.length - 1) 
        {
            return arr[n];
        }    

        int f1 = maxArray(arr,n+1);
        int max = Math.max(f1, arr[n]);
        return max;
    }
    public static void main(String[] args) 
    {
        int arr[] = {10,30,50,20,100,40};
        int n = 0;
        System.out.println(maxArray(arr,n));
    }
}
