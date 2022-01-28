import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while(n != 0)
        {
            int ans = n%10;
            System.out.println(ans);
            n = n/10;
        }
    }
}
