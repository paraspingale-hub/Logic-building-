import java.util.Scanner;

public class Program7 {

    public static int additionTwoNumbers(int no1, int no2) {
        return no1 + no2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value1, value2;

        System.out.print("Enter first number: ");
        value1 = sc.nextInt();

        System.out.print("Enter second number: ");
        value2 = sc.nextInt();

        int ret = additionTwoNumbers(value1, value2);

        System.out.println("Addition is: " + ret);
    }
}