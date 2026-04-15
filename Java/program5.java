import java.util.Scanner;
public class program5 {
    public static void main (String A[])
    {
        int i = 10;
        int j = 11 ;
        int ans = 0;
        Scanner sobj= new Scanner(System.in); 
        System.out.println("Enter the first nos ");
        i = sobj.nextInt();

        System.out.println("Enter the sec nos ");
        j = sobj.nextInt();

        ans = i + j;
        System.out.println("The result is  : " + ans);



    }
    
}
