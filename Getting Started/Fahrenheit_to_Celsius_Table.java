import java.util.Scanner;

public class Fahrenheit_to_Celsius_Table {

    public static void main(String[] args) {
        int s;
        int e;
        int step;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextInt();
        e = scanner.nextInt();
        step = scanner.nextInt();
        
        for (int i = s; i <= e; i = i+20)
        {
            System.out.println(i + "    " + ((i - 32)*5/9));
        }
    }
}