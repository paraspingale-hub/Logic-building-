class program38
{
    public boolean  CheckPrime(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }
for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            break;          // Optimization
        }
    }

    if(iCnt > (iNo/2))     // No factors
    {
        return true;
    }
    else                    // Atleast one factor
    {
        return false;
    }
    
}

    public static void main(String A[])
    {
        int iNo = 90;
        program38 chk = new program38();
        chk.CheckPrime(iNo);
       
    }
}

/* 



tring to anlyse the changes maked it the code    
*/