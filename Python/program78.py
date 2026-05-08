#Use an Object-Oriented approach in Java to define a Number class with a method specifically for 
#displaying the factors of a given integer.

import gc
class digit:
    def __init__(self,iNo):
        self.iNo = iNo
        
    def get_factors(self):
        factors = []
        for i in range(1, (self.iNo//2)+1):
            if self.iNo % i == 0:
                factors.append(i)
        return factors
    
def main ():
    iValue = int(input("Enter the nos "))
    iRet = []
    iRet = digit(iValue)
    print("The factors are :")
    print(iRet.get_factors())
    
if __name__ == "__main__":
    main()
    
collect_obj = gc.collect()
        