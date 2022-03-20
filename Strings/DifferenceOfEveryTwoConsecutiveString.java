public class DifferenceOfEveryTwoConsecutiveString {
    public static String DifferenceOfString(String str) 
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) 
        {
            if (i == str.length()-1) 
            {
                sb.append(str.charAt(i));
                break;
            }
            sb.append(str.charAt(i));
            char ch = str.charAt(i);
            char next = str.charAt(i+1);
            sb.append(next - ch);
        }

        return sb.toString(); // .toString is for converting string builder to string
    }

    public static void main(String[] args) {
        String str = "abecd";

        System.out.println(DifferenceOfString(str));
        
    }
}