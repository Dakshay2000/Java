public class Seventh_pattern {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int nsp = n/2+1;

        for(int i = 1; i<=n; i++)
        {
            //For stars
            for(int j = 1; j<=nsp; j++)
            {
                System.out.print("* ");
            }
            
            //For loop spaces
            for(int j = 1; j <= nst; j++)
            {
                System.out.print("  ");
            }

            //For stars
            for(int j = 1; j <= nsp; j++)
            {
                System.out.print("* ");
            }

            if(i <= nsp)
            {
                nst = nst + 2;
                nsp = nsp - 1;
            }

            else{
                nst = nst - 2;
                nsp = nsp + 1;
            }
            System.out.println();
        }
    }
}
