import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> res = mazePath(0, 0, n, m);
        System.out.println(res);
    }

    public static ArrayList<String> mazePath(int sr, int sc, int dr, int dc) 
    {
        if (sr > dr || sc > dc) //First BaseCase
        {
            ArrayList<String> invalidBase = new ArrayList<>();
            return invalidBase;
        }

        if (sr == dr && sc == dc) //Second BaseCase
        {
            ArrayList<String> validBase = new ArrayList<>();
            validBase.add("");
            return validBase;
        }

        ArrayList<String> horizontalPath = mazePath(sr, sc + 1, dr, dc); //h
        ArrayList<String> verticalPath = mazePath(sr + 1, sc, dr, dc); //v

        ArrayList<String> ans = new ArrayList<>();
        for (String ss : horizontalPath) 
        {
            ans.add('h' + ss);
        }

        for (String ss : verticalPath) 
        {
            ans.add('v' + ss);
        }
        return ans;
    }
}
