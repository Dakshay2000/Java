public class AnyBseToAnyBase {
    public static int decimal(int base1, int num) {
        int ans = 0;
        int pow = 1;
        int rem;
        while(num != 0)
        {
            rem = num%10;
            ans = ans + (rem * pow);
            pow = pow*base1;
            num = num/10;
        }
        return ans;
    }

    public static int anybase(int result, int base2) {
        int ans = 0;
        int pow = 1;
        int rem;
        while(result != 0)
        {
            rem = result%base2;
            ans = ans + (rem * pow);
            pow = pow*10;
            result = result/base2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 111010;
        int base1 = 2;
        int base2 = 8;

        int result = decimal(base1, num);

        int finalans = anybase(result, base2);

        System.out.println(result);

        System.out.println(finalans);
    }
}
