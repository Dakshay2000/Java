import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int ans = 0;
        int max = b;
        
        if(n == 0 || n == 1)
        {
            System.out.println(n);
            return;
        }

        for(int i = 1;i <= n;i++)
        {
            b = ans;
            ans = max + ans;
            max = b;
        }
        System.out.println(ans);
    }
}