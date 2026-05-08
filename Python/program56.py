def CheckPrime(iNo):
    iCnt = 0
    
    if iNo < 0:
        iNo = -iNo
    
    # Same loop logic as C version
    for iCnt in range(2, (iNo // 2) + 1):
        if (iNo % iCnt) == 0:
            break  # Optimization
    
    # Same condition as C version
    if iCnt > (iNo // 2):
        return True  # No factors found
    else:
        return False  # At least one factor found

# Main function equivalent
if __name__ == "__main__":
    iValue = int(input("Enter the number : \n"))
    bRet = CheckPrime(iValue)
    
    if bRet == True:
        print(f"{iValue} is a prime number")
    else:
        print(f"{iValue} is not a prime number")