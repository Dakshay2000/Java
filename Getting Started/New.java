import java.util.Scanner;

public class New {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A");
            }
            else{
                System.out.println("C");
            }
        }
        else if(b > c){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }
}
