public class Sixteen_pattern {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int nsp = n/2;
        int oval = 1;

        for(int i = 1; i<=n; i++)
        {
            int ival = oval;

            //For loop spaces
            for(int j = 1; j <= nsp; j++)
            {
                System.out.print("  ");
            }
            
            //For stars
            for(int j = 1; j <= nst; j++)
            {
                if(j > nst/2){
                    System.out.print(ival + " ");
                    ival--;
                }
                else{
                    System.out.print(ival + " ");
                    ival++;
                }
            }

            if(i <= n/2){
                nst = nst + 2;
                nsp = nsp - 1;
                oval++;
            }

            else{
                nst = nst - 2;
                nsp = nsp + 1;
                oval--;
            }
            System.out.println();
            
        }
    }
}
