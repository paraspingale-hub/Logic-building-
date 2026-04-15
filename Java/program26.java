
import java.util.Scanner;

class Display 
{
    void Display(int iFrequency)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= iFrequency; iCnt++)
    {
        System.out.println("Jay Ganesh...\n");
    }
}

}

class program26
{
       public static void main (String A[])
    {Scanner sobj = new Scanner (System.in);

        int iCount = 0;
    
        System.out.println("Enter the frequency : \n");
        iCount = sobj.nextInt();
        Display dobj = new Display();
        dobj.Display(iCount);   
    }

    
}