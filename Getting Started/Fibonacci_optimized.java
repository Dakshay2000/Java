import java.util.Scanner;

public class Fibonacci_optimized {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int a = 0;
        int b = 1;
        for(int i = 1;i <= n;i++)
        {
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
