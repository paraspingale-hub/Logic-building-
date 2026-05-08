def CheckPrime(iNo):
    # 1. Handle negative numbers and edge cases (0, 1)
    if iNo < 0:
        iNo = -iNo
    
    if iNo < 2:
        return False

    # 2. Loop using floor division (//)
    # We go up to (iNo // 2) + 1 because range is exclusive of the stop value
    for iCnt in range(2, (iNo // 2) + 1):
        if (iNo % iCnt) == 0:
            # If we find even one factor, it's not prime
            return False
            
    return True

def Main():
    try:
        iValue = int(input("Enter the number: "))
        
        bRet = CheckPrime(iValue)
        
        if bRet:
            print(f"{iValue} is a prime number")
        else:
            print(f"{iValue} is not a prime number")
    except ValueError:
        print("Please enter a valid integer.")

if __name__ == "__main__":
    Main()