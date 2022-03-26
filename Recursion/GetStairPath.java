import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {
    public static ArrayList<String> Stair(int n) 
    {
        if (n == 0) 
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        else if (n < 0) 
        {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> path1 = Stair(n-1);
        ArrayList<String> path2 = Stair(n-2);
        ArrayList<String> path3 = Stair(n-3);

        ArrayList<String> Paths = new ArrayList<>();

        for (String rstr : path1) 
        {
            Paths.add("1" + rstr);
        }
        for (String rstr : path2) 
        {
            Paths.add("2" + rstr);
        }
        for (String rstr : path3) 
        {
            Paths.add("3" + rstr);
        }

        return Paths;
    }

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> res = Stair(n);
        System.out.println(res);
    }
}
