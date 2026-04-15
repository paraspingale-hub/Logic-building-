
/*
    Step 1 : Understand the problem statement
    Step 2 : Write the algorithm
    Step 3 : Decide the programming language
    Step 4 : Write the program
    Step 5 : Test the program
*/


/*
    Algorithm

    START
        Accept first number as no1
        Accept second number as no2
        If the input is negative then convert it into positive
        Perform Addition of no1 & no2
        Display the addition on screen
    STOP
*/
import java.util.Scanner;
class Add
{   
    public float sum (float  a , float  b) 
    {
        float sum = 0;

        // updator 
        if(a < 0.0f)
    {
        a = -a;
    }

    if(b < 0.0f)
    {
        b = -b;
    }

    sum = a + b;    // Business Logic
    
    return sum;
    }
            
}
    

public class program9 {
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
