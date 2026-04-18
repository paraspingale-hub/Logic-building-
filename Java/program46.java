import java.util.Scanner;

public class program46 {

    // Wrong approach (translated directly from your C code)
    public static void displayFactors(int iNo) {
        if ((iNo % 1) == 0) {
            System.out.println("1");
        }
        if ((iNo % 2) == 0) {
            System.out.println("2");
        }
        if ((iNo % 3) == 0) {
            System.out.println("3");
        }
        if ((iNo % 4) == 0) {
            System.out.println("4");
        }
        if ((iNo % 5) == 0) {
            System.out.println("5");
        }
    }

    public static void main(String[] args) {
        int iValue = 0;

        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = scanner.nextInt();

        // Calling the method
        displayFactors(iValue);

        // Closing the scanner to free up resources
        scanner.close();
    }
}