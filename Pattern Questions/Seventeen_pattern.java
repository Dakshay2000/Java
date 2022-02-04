public class Seventeen_pattern {
    public static void main(String[] args) {
        int n = 10;
        int nsp = (2*n)-3;
        //int val = 1;

        for(int i = 1; i <= n; i++)
        {
            int p = i;
            //For Numbers
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }

            //For Spaces
            for(int j = 1; j <= nsp; j++){
                System.out.print("  ");
            }

            //For Numbers
            for(int j = 1; j <= i; j++){

                if(p == 0){
                    break;
                }
                if(p == n){
                    p--;
                    System.out.print(p + " ");
                    p--;
                }
                else{
                    System.out.print(p + " ");
                    p--;
                }
            }
            System.out.println();
            nsp = nsp - 2;
        }
    }
}
