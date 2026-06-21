import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, ans;

        System.out.print("Enter first number: ");
        i = sc.nextInt();

        System.out.print("Enter second number: ");
        j = sc.nextInt();

        ans = i + j;

        System.out.println("Addition is: " + ans);
    }
}