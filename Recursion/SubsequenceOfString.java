import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceOfString {
    public static ArrayList<String> gss(String str) 
    {
        if (str.length() == 0) 
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> myAns = new ArrayList<>();
        for(String rstr : rres){ //For Each Loop
            myAns.add("" + rstr); //Exclude Character
            myAns.add(ch + rstr); //Include Character
        }
        //OR (Normal Way of writing a loop)
        // for (int i = 0; i < rres.size(); i++) 
        // {
        //     myAns.add("" + rres.get(i));
        //     myAns.add(ch + rres.get(i));
        // }
        return myAns;
    }

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }
}
