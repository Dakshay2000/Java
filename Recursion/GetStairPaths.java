import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<String> res = stair(n);
        System.out.println(res);
    }

    public static ArrayList<String> stair(int n) 
    {
        if (n == 0) 
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (n >= 1) 
        {
            ArrayList<String> path1step = stair(n-1);
            for (String path : path1step) 
            {
                ans.add('1' + path);
            }
        }

        if (n >= 2) 
        {
            ArrayList<String> path2step = stair(n-2);
            for (String path : path2step) 
            {
                ans.add('2' + path);
            }
        }

        if (n >= 3) 
        {
            ArrayList<String> path3step = stair(n-3);
            for (String path : path3step) 
            {
                ans.add('3' + path);
            }
        }

        return ans;
    }
}
