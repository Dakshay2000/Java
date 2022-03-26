import java.util.ArrayList;

public class Practice {
    public static void main(String[] args){
        // write your code here
        int idx = 0;
        int arr[] = {1,2,3,4};
        ArrayList<String> Try = pdi(idx,arr);
        System.out.println(Try);
    }

    public static ArrayList<String> pdi(int idx, int arr[]){
        // ArrayList<Integer> send = new ArrayList<>();
        if(idx == 3)
        {
            ArrayList<String> base = new ArrayList<>();
            // base.add(Integer.toString(arr[idx]));
            return base;
        }

        String push = Integer.toString(arr[idx]);
        pdi(idx+1, arr);
        ArrayList<String> rres = new ArrayList<>();
        rres.add(push);
        System.out.println(rres);
        System.out.println(rres.size());

        // ArrayList<Integer> rres = new ArrayList<>();
        // rres = arr;
        // // System.out.println(rres);
        // pdi(idx+1,arr);


        ArrayList<String> send = new ArrayList<>();
        // for (Integer rstr : rres) 
        // {
        //     send.add(rstr);
        // }
        // System.out.println(rres);
        // System.out.println(rres.size());
        for (int i = 0; i < rres.size(); i++) 
        {
            send.add(rres.get(i));
        }
        // System.out.println(send);
        return send;
    }
}
