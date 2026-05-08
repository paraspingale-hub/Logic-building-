import java.util.Scanner;

/**
 * Requirement: Java 16 or higher (for the 'record' feature).
 * Filename: program52.java
 */
public class program53 {

    // A record is a concise way to create a data-holding class
    // It automatically generates constructors, getters, and toString()
    record FactorResult(int factorCount, int nonFactorCount) {}

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        
        // Validation to ensure input is an integer
        if (sobj.hasNextInt()) {
            int iValue = sobj.nextInt();

            if (iValue <= 0) {
                System.out.println("Please enter a number greater than 0.");
            } else {
                // Call the logic function
                FactorResult result = calculateFactors(iValue);

                // Access the record components using accessor methods
                System.out.println("--- Results for " + iValue + " ---");
                System.out.println("Total Factors: " + result.factorCount());
                System.out.println("Total Non-Factors: " + result.nonFactorCount());
            }
        } else {
            System.out.println("Invalid input. Please enter a whole number.");
        }

        sobj.close();
    }

    /**
     * Iterates from 1 to iNo to determine how many numbers
     * divide iNo perfectly (factors) and how many do not.
     */
    public static FactorResult calculateFactors(int iNo) {
        int factorsCount = 0;
        int nonFactorsCount = 0;

        // Loop through all numbers from 1 to iNo
        for (int i = 1; i <= iNo; i++) {
            if (iNo % i == 0) {
                factorsCount++;
            } else {
                nonFactorsCount++;
            }
        }
        
        // Return both counts wrapped in the record object
        return new FactorResult(factorsCount, nonFactorsCount);
    }
}