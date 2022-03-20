import java.util.Scanner;

//This method helps in reducing the recursive calls and helps in decreasing time complexity
public class PowerLogarithmic {
    public static int power(int x, int n) 
    {
        if (n == 0) 
        {
            return 1;
        }    

        int xpny2 = power(x,n/2);
        int ans = xpny2 * xpny2;

        if (n%2 != 0) 
        {
            ans = ans * x;
        }
        
        return ans;
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
