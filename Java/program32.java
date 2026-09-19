class Program32
{
    public static void Display()
    {
        int iCnt = 0;

        iCnt = 1;

        while(iCnt <= 5)
        {
            System.out.print(iCnt + "\t" + "*"+ "\t" );
            iCnt++;
        }

        System.out.println();
    }

    public static void main(String A[])
    {
        Display();
    }
}