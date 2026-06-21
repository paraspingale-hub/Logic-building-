import java.util.Scanner;

public class Program8 {

    public static float additionTwoNumbers(float no1, float no2) {
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