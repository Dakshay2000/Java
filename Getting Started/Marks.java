import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if(n>90)
        {
            System.out.println("Excellent");
        }

        else if(n>80 && n<=90)
        {
            System.out.println("Good");
        }

        else if(n>70 && n<=60)
        {
            System.out.println("Fair");
        }

        else if(n>60 && n<=70)
        {
            System.out.println("Meets Expectations");
        }
        
        else{
            System.out.println("Below par");
        }
    }
}