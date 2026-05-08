import java.util.Scanner;

public class program54 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int iValue = sobj.nextInt();

        boolean bRet = isPrime(iValue); 

        if (bRet) {
            System.out.println(iValue + " is a prime number.");
        } else {
            System.out.println(iValue + " is not a prime number.");
        }
        
        sobj.close();
    }

    // Method must be static to be called from main
    public static boolean isPrime(int iNo) {
        // Handle edge cases
        if (iNo < 2) return false;

        // Use a boolean flag logic
        boolean bFlag = true;

        // Check factors from 2 up to N/2
        for (int i = 2; i <= iNo / 2; i++) {
            if (iNo % i == 0) {
                // If divisible, it's not prime
                bFlag = false;
                break; // Exit the loop immediately
            }
        }

        return bFlag;
    }
}