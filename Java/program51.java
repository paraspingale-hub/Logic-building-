//Develop a C program that accepts an integer and returns the total
//count of its factors by iterating up to half of the number's value.
import java.util.Scanner;

public class program51 {

    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;

        System.out.println("Enter an nos ");
        int iValue = sobj.nextInt();
        iRet = Display(iValue);
        System.out.println(iRet);

        sobj.close();
        
    }

    public static int Display(int iNo)
    {
        int count =0;
        for (int i = 1 ; i<=iNo/2 ;i++)
        {
            if(iNo%i == 0)
            {
                count++;
            }
        }
        return count;

    }
    
}
