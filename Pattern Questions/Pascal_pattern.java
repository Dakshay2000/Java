public class Pascal_pattern {
    public static void main(String[] args) {
        int n = 5;
        //int val = 1;

        for(int i = 0; i < n; i++)
        {
            int val = 1;
            for(int j = 0; j <= i; j++)
            {
                System.out.print(val + "  ");
                val=((val*(i-j))/(j+1));
            }
            System.out.println();
        }
    }
}
