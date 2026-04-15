import java.util.Scanner;
class Add
{   
    public int sum (int a , int b) 
    {
        int sum = 0;
        sum = a + b;    
        return sum;
    }
}
    

public class program6 {
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

          int i = 0;
         int j = 0;


         System.out.println("Enter the first nos ");
         i = sobj.nextInt();

         System.out.println("Enter the sec nos ");
         j = sobj.nextInt();

         int ans = 0;

         Add aobj = new Add();
         ans = aobj.sum(i , j);
         System.out.println("Anser is " + ans);
    }
}
