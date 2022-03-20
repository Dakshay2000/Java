import java.util.ArrayList;

public class RemovePrime {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        
        ArrayList<Integer>Prime = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 2; j < arr[i]; j++) 
            {
                if (arr[i] % j == 0) 
                {
                    Prime.add(arr[i]);
                    break;
                }
            }
        }

        System.out.println(Prime);
        
    }
}
