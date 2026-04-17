
import java.util.Scanner;

class Display
{
    public void  Divisible(int iNo1 , int iNo2)
    {   
        int iCnt = 0;
        if(iNo1 % iNo2 ==0)
        {

            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
}

    }

public class program42 {
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iValue2 = 0;

        System.out.println("Please enter frequency : \n");
        iValue = sobj.nextInt();

        System.out.println("Please enter frequency : \n");
        iValue2 = sobj.nextInt();

        Display dobj = new Display();
        dobj.Divisible(iValue , iValue2);

    }
    
}
