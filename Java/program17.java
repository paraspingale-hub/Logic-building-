
import java.util.Scanner;

/*
    START
        Accept number and store as no
        Divide no by 2 
        If the remainder is 0
            then display as Even
        otherwise 
            display as Odd
    STOP

*/
class checkoddevem
{
    public boolean oddeven(int iNo1)
    {
        int iRem = 0;
        iRem = iNo1 % 2;
        return (iRem == 0);
    }
}
public class program17 {
    public static void main (String A[])
    {

        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        checkoddevem cobj = new checkoddevem();
        boolean iRem ; 
        iRem = cobj.oddeven(iValue);

        
       if(iRem == true)
        {
            System.out.println("is Even number\n"+iValue);
        }
        else
        {
            System.out.println(" is Odd number"+iValue);
        }

    }
    
}
