class program58
{
    public boolean CheckPrime (int iNo)
{
    int iCnt = 0;
    boolean bFlag = false;

    if(iNo < 0)
    {
        iNo = -iNo;
    }
        
    for(iCnt = 2, bFlag = true; iCnt <= (iNo / 2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            bFlag = false;
            break;          // Optimization
        }
    }

    return bFlag;
    
}

    public static void main(String A[])
    {
    int iValue = 90;
    boolean bRet = false;

    program58 chk = new program58();
    bRet = chk.CheckPrime(iValue);

    if(bRet == true)
    {
        System.out.println(" is a prime number\n"+iValue);
    }
    else
    {
        System.out.println("is not a prime number\n"+iValue);
    }
           
    }
}

/* 



tring to anlyse the changes maked it the code    
*/