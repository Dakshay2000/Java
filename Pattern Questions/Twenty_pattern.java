public class Twenty_pattern {
    public static void main(String[] args) {
        int n = 9;

        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1)
                {
                    if((j >= 1 && j <= n/2+1) || (j == n))
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                
                if(i > 1 && i <= n/2)
                {
                    if(j == n/2+1 || j == n)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }

                if(i == n/2+1)
                {
                    System.out.print("* ");
                }

                if(i > n/2+1 && i < n)
                {
                    if(j == n/2+1 || j == 1)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }

                if(i == n)
                {
                    if(j >= n/2+1 || j == 1)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
}
