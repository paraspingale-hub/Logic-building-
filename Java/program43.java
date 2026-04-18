import java.util.Scanner;

class  program43 {
    
    // Method to check divisibility
    // Equivalent to the C function, but marked 'static' so it can be called from main
    public static boolean checkDivisible(int iNo1, int iNo2) {
        if ((iNo1 % iNo2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0, iValue2 = 0;
        boolean bRet = false;

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        // Call the method
        bRet = checkDivisible(iValue1, iValue2);

        if (bRet == true) {
            System.out.println("It is completely divisible");
        } else {
            System.out.println("It is not divisible");
        }

        // Close the scanner resource
        sobj.close();
    }
}
