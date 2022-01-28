import java.util.Scanner;

public class sum_of_even_number_till_n {

    public static void main(String[] args) {
        int sum = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        for(int i=1; i<=n; i++){  
            if (i % 2 == 0)
            {
                sum = sum + i;
            }
        }  
        System.out.println(sum);
    }
}
