#Design a Java program structure intended to check if a number is "perfect"
# (sum of factors equals the number), though the current logic only prints factors.
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
        