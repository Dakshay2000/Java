public class ToggleCase {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        String str = "GnGkhJFubDG";
        
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            // int temp = ch;
            if (ch >= 'A' && ch <= 'Z') 
            {
                ch = Character.toLowerCase(ch);
                // temp+= 32;
                // ch = (char)temp;
                // str.charAt(i) = String.valueOf(ch);
                System.out.print(ch);
            }
            else
            {
                ch = Character.toUpperCase(ch);
                // str.charAt(i) = ch;
                System.out.print(ch);
            }
        }
    }
}
