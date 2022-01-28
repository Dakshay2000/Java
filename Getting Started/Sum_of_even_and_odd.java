import java.util.Scanner;

public class Sum_of_even_and_odd {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int ans;
        int evensum = 0;
        int oddsum = 0;

        while (n != 0)
        {
            ans = n%10;;
            if (ans%2 == 0)
            {
                evensum = evensum + ans;
                n = n/10;
            }
            else{
                oddsum = oddsum + ans;
                n = n/10;
        }
    }
    System.out.println(evensum + " " + oddsum);
    }
}