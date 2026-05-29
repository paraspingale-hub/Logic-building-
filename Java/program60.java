
import java.util.ArrayList;
import java.util.Scanner;

//Create a basic C program to demonstrate manual digit extraction from a 
// hardcoded integer (7236) using repeated modulo (%) and division (/) operations
public class program60 {

    public static void main (String A[])
    {
        Scanner sobj = new Scanner (System.in);
        int iValue = sobj.nextInt();
        
        ArrayList<Integer> iRet = new ArrayList<>();

        iRet = DigitExtraction(iValue);
        
    }
    public ArrayList<Integer> DigitExtraction(int iNo)
    {
        ArrayList<Integer> Digits = new ArrayList<>();

        while (iNo != 0)
        {
            Digits.add(iNo%10);
            iNo = iNo/10; 
        }
        return Digits;
    }
}
