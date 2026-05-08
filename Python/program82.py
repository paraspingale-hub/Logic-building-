#Write an OOP-based program to accept an integer from the user and check if it is a Perfect Number using a standard for loop up to $N/2$.import gc
import gc
class digit:
    def __init__(self,iNo):
        self.iNo = iNo
        
    def get_factors(self):
        factors = 0
        for i in range(1, (self.iNo//2)+1):
            if self.iNo % i == 0:
                factors = factors + i
                
        return (factors == self.iNo)
            
    
def main ():
    iValue = int(input("Enter the nos "))
    iRet = []
    iRet = digit(iValue)
    print("The factors are :")
    if(iRet == True):
        print("Prefect Number ")
    else:
        print("Not a Prefect Number ")
    
if __name__ == "__main__":
    main()
    
collect_obj = gc.collect()
        