import java.util.Scanner;

public class program47 {

    // Method to display factors of a given number
    public static void displayFactors(int iNo) {
        int iCnt = 0;

        // Loop to find and print factors
        for (iCnt = 1; iCnt < iNo; iCnt++) {
            if ((iNo % iCnt) == 0) {
                System.out.println(iCnt);
            }
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