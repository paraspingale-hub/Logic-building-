import java.util.Scanner;

class Program27
{
    public static void Display(int iFrequency)
    {
        int iCnt = 0;

        // Filter
        if(iFrequency < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        for(iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }

    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        int iCount = 0;

        System.out.println("Enter the frequency : ");
        iCount = sc.nextInt();

        Display(iCount);

        sc.close();
    }
}