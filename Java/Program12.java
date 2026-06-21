import java.util.Scanner;

public class Program12 {

    public static void checkEvenOdd(int no) {

        if (no % 2 == 0) {
            System.out.println("It is Even number");
        } else {
            System.out.println("It is Odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int value = sc.nextInt();

        checkEvenOdd(value);
    }
}