#Design a Java program to find and display all factors of a hardcoded integer (12) by iterating through half of its value.
def Factors():
    iDigit =[]
    for i in range (1 ,7):
        if(12%i == 0):
            iDigit.append(i)
    return iDigit

def main():
    iRet = []
    print("All the factors of the Digit 12 is :")
    iRet = Factors()
    print(iRet)
    
    
if __name__ == "__main__":
    main()
    