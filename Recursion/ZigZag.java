public class ZigZag {
    public static void ZigZag(int n) 
    {
        if (n == 0) 
        {
            return;
        }
        System.out.print(n + " ");
        ZigZag(n-1);
        System.out.print(n + " ");
        ZigZag(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) 
    {
        int n = 3;
        ZigZag(n);
    }
}
