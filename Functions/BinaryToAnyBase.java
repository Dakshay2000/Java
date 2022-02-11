public class BinaryToAnyBase {
    public static int decimal(int base, int num) {
        int ans = 0;
        int pow = 1;
        int rem;
        while(num != 0)
        {
            rem = num%10;
            ans = ans + (rem * pow);
            pow = pow*base;
            num = num/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 111010;
        //We can put any base here
        int base = 8;

        int result = decimal(base, num);
        System.out.println(result);
    }
}
