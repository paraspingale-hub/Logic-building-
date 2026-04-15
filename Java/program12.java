
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
    public void oddeven(int iNo1)
    {
        int iRem = 0;
        iRem = iNo1 % 2;
    if(iRem == 0)
    {
        System.out.println("It is Even number\n");
    }
    else
    {
        System.out.println("It is Odd number\n");
    }
        
    }
}
public class program12 {
    public static void main (String A[])
    {

        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        checkoddevem cobj = new checkoddevem();
        cobj.oddeven(iValue);

    }
    
}
