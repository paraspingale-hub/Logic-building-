
public class program45 {

    // Method to display factors of 6
    public static void displayFactors() {
        if ((6 % 1) == 0) {
            System.out.println("1");
        }
        if ((6 % 2) == 0) {
            System.out.println("2");
        }
        if ((6 % 3) == 0) {
            System.out.println("3");
        }
        if ((6 % 4) == 0) {
            System.out.println("4");
        }
        if ((6 % 5) == 0) {
            System.out.println("5");
        }
    }

    public static void main(String[] args) {
        int iValue = 0;

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter number : ");
        // iValue = scanner.nextInt();

        displayFactors();
        
        // if scanner was used, you would close it here:
        // scanner.close();
    }
}