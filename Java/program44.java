import java.util.Scanner;

public class program44 {

    // Method to check if the first number is divisible by the second
    public static boolean checkDivisible(int iNo1, int iNo2) {
        if ((iNo1 % iNo2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int iValue1 = 0, iValue2 = 0;
        boolean bRet = false;

        System.out.println("Enter first number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = scanner.nextInt();

        // Calling the method
        bRet = checkDivisible(iValue1, iValue2);

        // Checking the returned boolean value
        if (bRet == true) {
            System.out.println("It is completely divisible");
        } else {
            System.out.println("It is not divisible");
        }

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}