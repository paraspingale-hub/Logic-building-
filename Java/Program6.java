
import java.util.Scanner;

public class Program6 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;

        System.out.print("Enter first number: ");
        i = sc.nextInt();

        System.out.print("Enter second number: ");
        j = sc.nextInt();

        int ans = add(i, j);

        System.out.println("Addition is: " + ans);
    }
}