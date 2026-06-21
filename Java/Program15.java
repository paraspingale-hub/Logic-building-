import java.util.Scanner;

public class Program15 {

    public static boolean checkEvenOdd(int no) {
        return (no % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int value = sc.nextInt();

        if (checkEvenOdd(value)) {
            System.out.println(value + " is Even number");
        } else {
            System.out.println(value + " is Odd number");
        }
    }
}