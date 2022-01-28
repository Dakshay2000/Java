import java.util.Scanner;

public class Nth_Fibonacci_Number {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;

        if(n == 0 || n == 1){
            System.out.println(n);
            return;
        }

        for (int i = 2; i <= n; i++)
        {
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(sum);
    }
}