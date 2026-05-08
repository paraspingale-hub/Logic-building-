def CheckPrime(iNo):
    iCnt = 0
    bFlag = False

    if iNo < 0:
        iNo = -iNo
    
    bFlag = True
    
    for iCnt in range(2, (iNo // 2) + 1):
        if (iNo % iCnt) == 0:
            bFlag = False
            break  # Optimization

    return bFlag

if __name__ == "__main__":
    iValue = 0
    bRet = False

    iValue = int(input("Enter the number : \n"))

    bRet = CheckPrime(iValue)

    if bRet == True:
        print(f"{iValue} is a prime number")
    else:
        print(f"{iValue} is not a prime number")