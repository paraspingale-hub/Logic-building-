import java.util.Scanner;

public class program39 {

    
    public static void Display(int iNo) {
        
        for (int iCnt = iNo; iCnt <= 1; iCnt--) {
            System.out.print(iCnt + "\t");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Please enter frequency : ");
        iValue = sobj.nextInt();

        Display(iValue);

        
        sobj.close(); 
    }
}