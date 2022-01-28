import java.util.Scanner;

public class For_all_prime_numbers_till_n {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int a = 2;

        for (int i = 2; i <= a;)
        {
            if (a > n)
            {
                break;
            }

            if (a%i == 0 && a == i)
            {
                System.out.println(a); 
                a++;
                i = 2;
            }
        
            if (a%i == 0)
            {
                a++;
                i = 2;
                continue;
            }
        i++;
        }
    }
}