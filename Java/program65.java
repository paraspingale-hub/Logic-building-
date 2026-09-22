class program65
{
    public static void main(String A[])
    {
    int iNo = 7236;
    int iDigit = 0;

    while(iNo != 0)
    {
        System.out.println("--------------------------------------------------\n");
        iDigit = iNo % 10;
        System.out.println("iDigit is : %d\n"+iDigit);
        iNo = iNo / 10;
        System.out.println("iNo is : %d\n"+iNo);
    }
    
    System.out.println("--------------------------------------------------\n");

    
    }
}

