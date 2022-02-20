public class AnyBaseMultiplication {
    //Pending Question

    public static int product(int n1, int n2, int base) {
        
        int carry = 0;
        int ans = 0;
        int power = 1;
        

        while(n1 != 0)
        {
            int l1 = n1%10;
            // int l2 = n2%10;

            n1 = n1/10;
            // n2 = n2/10;

            while(n2 != 0)
            {
                int l2 = n2%10;
                n2 = n2/10;
                int mul = (l1 * l2) + carry;
                int mod = mul % base;
                int div = mul / base;
                carry = div;
                ans = ans + (mod * power);
                power = power * 10;
            }

            // int add = l1 + l2 + carry;

            // int mod = add % base;
            // int div = add / base;
            // carry = div;
            
            // ans = ans + (mod * power);
            // power = power * 10;
        }
        return ans;
    }

    public static int addition(int n1, int n2, int base) {
        
        int carry = 0;
        int ans = 0;
        int power = 1;
        

        while(n1 != 0 || n2 != 0 || carry != 0)
        {
            int l1 = n1%10;
            int l2 = n2%10;

            n1 = n1/10;
            n2 = n2/10;

            int add = l1 + l2 + carry;

            int mod = add % base;
            int div = add / base;
            carry = div;
            
            ans = ans + (mod * power);
            power = power * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n1 = 724;
        int n2 = 72;
        int base = 8;

        int result = addition(n1, n2, base);

        System.out.println(result);

    
    }
}
