import java.util.Scanner;

public class program49 {

    // Method to display factors of a given number
    public static void displayFactors(int iNo) {
        int iCnt = 0;

        // Filter: Convert negative number to positive
        if (iNo < 0) {
            iNo = -iNo;
        }

        // Time Complexity : O(N)
        for (iCnt = 1; iCnt < iNo; iCnt++) {
            if ((iNo % iCnt) != 0) {
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