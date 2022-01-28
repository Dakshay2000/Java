import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        boolean isprime = true;
        for(int i = 2;i*i<=n;i++)
        {
            if(n%i == 0)
            {
                isprime = false;
                break;
            }
        }

        if(isprime)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
    }
}