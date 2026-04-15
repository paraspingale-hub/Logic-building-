/////////////////////////////////////////////////////////////
//
// Required Header files
//
/////////////////////////////////////////////////////////////

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

/////////////////////////////////////////////////////////////
//
//  Function Name :     CheckEvenOdd
//  Description :       It is used to check even or odd
//  Input :             Integer
//  Output :            Boolean
//  Author :            Paras Rahul Pingale
//  Date :              10/10/2025
//
/////////////////////////////////////////////////////////////
class checkoddevem
{
    public boolean oddeven(int iNo1)
    {
        int iRem = 0;
        iRem = iNo1 % 2;
    if(iRem == 0)
    {
        return true;
    }
    else
    {
        return false ; 
    }
         
    }
}


/////////////////////////////////////////////////////////////
//
//  Entry point function of the application
//  
/////////////////////////////////////////////////////////////

public class program16 {
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
