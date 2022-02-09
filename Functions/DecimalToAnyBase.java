public class DecimalToAnyBase {
    public static int binary(int base, int num) {
        int ans = 0;
        int pow = 1;
        int rem;
        while(num != 0)
        {
            rem = num%base;
            ans = ans + (rem * pow);
            pow = pow*10;
            num = num/base;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 58;
        int base = 8;

        int result = binary(base, num);
        System.out.println(result);
    }
}
