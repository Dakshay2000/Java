public class ToggleCaseEfficient {

    public static String ToggleCase(String str) 
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') 
            {
                sb.append((char)(ch - 'a' + 'A'));
            }
            else
            {
                sb.append((char)(ch - 'A' + 'a'));
            }
        }

        return sb.toString(); // .toString is for converting string builder to string
    }

    public static void main(String[] args) {
        String str = "GnGkhJFubDG";

        System.out.println(ToggleCase(str));
        
    }
}
