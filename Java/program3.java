import java.util.Scanner;
public class program3 {

    public boolean  EvenOdd(float Nos)
    {
        return ((Nos % 2) == 0);

    }

    public static void main (String A[])
    {
        System.out.println("Enter the nos ");
        Scanner sobj = new Scanner (System.in);
        float nos = sobj.nextFloat();

        boolean bRet = false ;
        program3 pobj = new program3();
        bRet = pobj.EvenOdd(nos);

        if(bRet == true)
        {
            System.out.println("The value is even ");
        }
        else
        {
            System.out.println("The value is odd ");
        }

    }
    
}
