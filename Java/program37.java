class program37
{
    public boolean CheckDivisible(int iNo1, int iNo2)
{
    if((iNo1 % iNo2) == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

    public static void main(String A[])
    {
        int iValue1 = 78, iValue2 = 45;
        boolean bRet = false;   
        program37 chk = new program37();
        bRet = chk.CheckDivisible(iValue1, iValue2);

         if(bRet == true)
        {
            System.out.println("It is completely devisible\n");
         }    
        else
         {
            System.out.println("It is not divisible\n");
        }
    }
}