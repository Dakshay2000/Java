public class Eleventh_pattern {
    public static void main(String[] args) {
        int n = 5;
        int nst1 = 1;
        int nst2 = 0;
        int nsp1 = n/2;
        int nsp2 = n/2;

        for(int i = 1; i<=n; i++)
        {
            //For spaces
            for(int j = 1; j <= nsp1; j++)
            {
                System.out.print("   ");
            }
            
            //For stars
            for(int j = 1; j <= nst1; j++)
            {
                System.out.print("* ");
            }

            //For spaces
            for(int j = 1; j <= nsp2; j++)
            {
                System.out.print("   ");
            }
            
            //For stars
            for(int j = 1; j <= nst2; j++)
            {
                System.out.print("* ");
            }

            if(nst2 != 1){
                nst2 = 1;
            }

            if(i <= nsp1)
            {
                nsp1 = nsp1 - 1;
                nsp2 = nsp2 + 2;
            }

            else{
                nsp1 = nsp1 + 1;
                nsp2 = nsp2 - 2;
            }
            System.out.println();
        }
    }
}
