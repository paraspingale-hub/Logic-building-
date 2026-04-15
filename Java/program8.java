import java.util.Scanner;
class Add
{   
    public float sum (float  a , float  b) 
    {
        float sum = 0;
        sum = a + b;    
        return sum;
    }
}
    

public class program8 {
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float i = 0.0f;
        float j = 0.0f;


         System.out.println("Enter the first nos ");
         i = sobj.nextFloat();

         System.out.println("Enter the sec nos ");
         j = sobj.nextFloat();

         float ans = 0;

         Add aobj = new Add();
         ans = aobj.sum(i,j);
         System.out.println("Anser is " + ans);
    }
}
