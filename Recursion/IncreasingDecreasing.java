public class IncreasingDecreasing {
    public static void increasingdecreasing(int n) 
    {
        if (n == 0) 
        {
            return;
        }   

        System.out.println(n);
        increasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) 
    {
        int n = 5;
        increasingdecreasing(n);    
    }
}
