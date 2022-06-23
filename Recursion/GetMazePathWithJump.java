import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJump {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> res = mazePath(1, 1, n, m);
        System.out.println(res);
    }

    public static ArrayList<String> mazePath(int sr,int sc,int dr,int dc) 
    {
        if (sr == dr && sc == dc) 
        {
            ArrayList<String> validBase = new ArrayList<>();
            validBase.add("");
            return validBase;
        }

        ArrayList<String> ans = new ArrayList<>();
        // For horizontal moves
        for (int ms = 1; ms <= dc - sc; ms++) 
        {
            ArrayList<String> hPath = mazePath(sr, sc + ms, dr, dc);
            for (String ss : hPath) 
            {
                ans.add("h" + ms + ss);
            }
        }
        
        // For Vertical moves
        for (int ms = 1; ms <= dr - sr; ms++) 
        {
            ArrayList<String> vPath = mazePath(sr + ms, sc, dr, dc);
            for (String ss : vPath) 
            {
                ans.add("v" + ms + ss);
            }
        }
        
        //For Diagonal moves
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) 
        {
            ArrayList<String> dPath = mazePath(sr + ms, sc + ms, dr, dc);
            for (String ss : dPath) 
            {
                ans.add("d" + ms + ss);
            }
        }

        return ans;
    }
}
