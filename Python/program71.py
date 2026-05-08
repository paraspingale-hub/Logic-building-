#Create a C program to calculate and return the sum of all individual digits of a given integer, including handling for negative inputs.

import numpy as np

def Digits(iNo):
    iDigit = []
    while(iNo != 0):
        iDigit.append(iNo%10)
        iNo = iNo/10
        iRet = Calculataions(iDigit)
    return iRet
        
def Calculataions(iNo):
    iNo = abs(iNo)                                                      #negative value handaling 
    iSum = 0
    iSum = np.sum(iNo)
    return iSum 
    
        
        
def main ():
    try :                                                                #Invalid input handling 
        iValue = int(input("Enter the number"))
        iAns = Digits(iValue)
        print(f"Value of addition of the {iValue} is {iAns}")
    except ValueError:
        print("Please enter a valid integer.")
    
if __name__ == "__main__":
    main()
    