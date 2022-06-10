import java.util.ArrayList;
import java.util.Scanner;

public class PrintMazePathWithJump {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> res = mazePath(0, 0, n-1, m-1);
        System.out.println(res);
    }

    public static ArrayList<String> mazePath(int sr,int sc,int dr,int dc) 
    {
        if (sr > dr || sc > dc) 
        {
            ArrayList<String> invalidBase = new ArrayList<>();
            return invalidBase;
        }

        if (sr == dr && sc == dc) 
        {
            ArrayList<String> validBase = new ArrayList<>();
            validBase.add("");
            return validBase;
        }

        ArrayList<String> hPath = mazePath(sr, sc + 1, dr, dc);
        ArrayList<String> vPath = mazePath(sr + 1, sc, dr, dc);
        ArrayList<String> dPath = mazePath(sr + 1, sc + 1, dr, dc);

        ArrayList<String> ans = new ArrayList<>();
        for (String ss : hPath) 
        {
            ans.add('h' + ss);
        }

        for (String ss : vPath) 
        {
            ans.add('v' + ss);
        }

        for (String ss : dPath) 
        {
            ans.add('d' + ss);
        }

        return ans;
    }
}
