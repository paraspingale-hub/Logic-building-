
import java.util.Scanner;

class Display
{
    public void EVENNOS(int iNo)
    {   
        int iCnt = 0;

        for(iCnt = 2; iCnt <= iNo; iCnt+=2)
        {
            System.out.println(iCnt);
        }

    
    System.out.println();
}

    }

public class program41 {
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Please enter frequency : \n");
        iValue = sobj.nextInt();

        Display dobj = new Display();
        dobj.EVENNOS(iValue);

    }
    
}
