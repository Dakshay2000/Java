import java.util.Scanner;

public class Count_digits_in_a_number {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int count = 0;

        while(n != 0)
        {
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}
