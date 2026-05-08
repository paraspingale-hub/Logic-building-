def cout(iNo):
    iCount = 0
    while(iNo !=0):
        iNo = iNo/10
        iCount = iCount +1
    return iCount

def main ():
    iValue = 0
    iValue = int(input("Enter the nos "))
    
    iRet = cout(iValue)
    
    print(f"The count of the digits in the nos is : {iRet} in the nos : {iValue}")
    
    
if(__name__ == "__main__"):
    main()
    
    