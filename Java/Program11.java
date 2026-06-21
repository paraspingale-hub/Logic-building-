import java.util.Scanner;

public class Program11 {

    public static float additionTwoNumbers(float no1, float no2) {

        if (no1 < 0) {
            no1 = -no1;
        }

        if (no2 < 0) {
            no2 = -no2;
        }

        return no1 + no2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float value1, value2;

        System.out.print("Enter first number: ");
        value1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        value2 = sc.nextFloat();

        float ret = additionTwoNumbers(value1, value2);

        System.out.println("Addition is: " + ret);
    }
}