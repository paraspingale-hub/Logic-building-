def CountFactors(iNo):
    iCnt = 0 
    iFreq = 0
    iRemaning = 0
    
    if(iNo < 0):
        iNo = -iNo
    for i in range (1 , iNo):
        if ((iNo % i) != 0):
            iFreq = iFreq+1
        else:
            iRemaning = iRemaning+1
            
    return iFreq , iRemaning

def main():
    iNo = int(input("Enter the nos"))
    iFreq , iRem = CountFactors(iNo)
    print(f"Number of non factor are : {iFreq}")
    print(f"Number of the factors :{iRem}")
        
main()