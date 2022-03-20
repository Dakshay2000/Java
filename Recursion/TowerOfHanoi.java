import java.util.Scanner;

public class TowerOfHanoi {
    public static void TOI(int n, int A, int B, int C) 
    {
        if (n == 0) 
        {
            return;
        }    

        TOI(n-1, A, C, B);
        System.out.println(n + "[" + A + " -> " + B + "]");
        TOI(n-1, C, B, A);
    }
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();

        TOI(n, A, B, C);
    }
}
