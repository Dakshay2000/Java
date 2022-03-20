import java.util.Scanner;

public class PowerLinear {
    public static int power(int x, int n) 
    {
        if (n == 0) 
        {
            return 1;
        }    

        return x * power(x,n-1);
    }
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        int x; //Number
        int n; //Power of x

        x = scn.nextInt();
        n = scn.nextInt();

        System.out.println(power(x,n));
    }
}
