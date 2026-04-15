import java.util.Scanner;
class addition
{
    public int sumation (int iNo1 , int iNo2)
    {
        int iSum = 0;
        iSum = iNo1 + iNo2;    // Business Logic
        return iSum;
    }
}
public class program7 {
    public static void main (String A[])
    {

        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        System.out.println("Enter first number : \n");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : \n");
        iValue2 =sobj.nextInt();
        addition aobj = new addition();
        iRet = aobj.sumation(iValue1,iValue2);

        System.out.println("Addition is :"+iRet);


    }
    
}
