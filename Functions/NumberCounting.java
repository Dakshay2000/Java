public class NumberCounting {
    public static int counting(int a, int num) {
        int count = 0;
        int rem;
        while(num != 0)
        {
            rem = num%10;
            if(rem == a)
            {
                count++;
            }
            num = num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 512222695;
        int a = 2;

        int result = counting(a, num);
        System.out.println(result);
    }
}
