#Create a Java program to find factors of a user-inputted number using BufferedReader for input, which requires handling checked exceptions.

def Factors(iNo):
    iDigit =[]
    for i in range (1 ,(iNo//2)+1):
        if(iNo%i == 0):
            iDigit.append(i)
    return iDigit

def main():
    iRet = []
    iValue = int(input("enter the nos "))
    print(f"All the factors of the Digit {iValue} is :")
    iRet = Factors(iValue)
    print(iRet)
    
    
if __name__ == "__main__":
    main()
    