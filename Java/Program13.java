import java.util.Scanner;

public class Program13 {

    public static boolean checkEvenOdd(int no) {
        return (no % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int value = sc.nextInt();

        boolean ret = checkEvenOdd(value);

        System.out.println("Result is: " + ret);
    }
}