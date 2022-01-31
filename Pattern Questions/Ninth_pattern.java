public class Ninth_pattern {
    public static void main(String[] args) {
        int n = 5;
        int nst = 5;
        int nsp = 1;

        for(int i = 1; i<=n; i++)
        {
            nst--;
            //For Spaces
            for(int j = 1; j <= nst; j++)
            {
                System.out.print("    ");
            }
            //For Stars
            for(int j = 1; j <= nsp ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
