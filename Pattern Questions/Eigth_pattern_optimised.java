public class Eigth_pattern_optimised {
    public static void main(String[] args) {
        int n = 5;
        

        for(int i = 1; i<=n; i++)
        {
            //For Spaces
            for(int j = 1; j <= n; j++)
            {
                if((j - i) == 0)
                {
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
