def CountFactors(iNo):
    iCnt = 0 
    iFreq = 0
    
    if(iNo < 0):
        iNo = -iNo
    for i in range (1 , iNo):
        if ((iNo % i) != 0):
            iFreq = iFreq+1
    return iFreq

def main():
    iNo = int(input("Enter the nos"))
    iRet = CountFactors(iNo)
    print(f"Number of non factor are : {iRet}")
    
main()