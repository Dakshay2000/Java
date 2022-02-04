public class Eighteen_pattern {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int nsp = n/2;

        for(int i = 1; i<=n; i++)
        {
            //For loop spaces
            for(int j = 1; j <= nsp; j++)
            {
                if(i == (n/2) + 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            
            //For stars
            for(int j = 1; j <= nst; j++)
            {
                System.out.print("* ");
            }

            if(i <= n/2){
                nst++;
            }

            else{
                nst--;
            }

            System.out.println();
        }
    }
}
