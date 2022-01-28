import java.util.Scanner;

public class Count_digits_in_a_number {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int count = 0;

        while(n != 0)
        {
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}
