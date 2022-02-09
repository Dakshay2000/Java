public class Ninteen_pattern {
    public static void main(String[] args) {
        int n = 7;
        int nst = n;
        int nsp = 0;

        for(int i = 1; i<=n; i++)
        {
            //For spaces
            for(int j = 1; j <= nsp; j++)
            {
                System.out.print("  ");
            }
            
            //For stars
            for(int j = 1; j <= nst; j++)
            {
                if(i <= n/2 && i >= 2)
                {
                    if( j == 1 || j == nst)
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }

                else if(i == 1)
                {
                    System.out.print("* ");
                }

                else{
                    System.out.print("* ");
                }
            }


            if(i <= n/2){
                nst = nst - 2;
                nsp++;
            }

            else{
                nst = nst + 2;
                nsp--;
            }

            System.out.println();
        }
    }
}
