def checkprime(iNo):
    iCnt = 0
    bFLaf = True
    
    if(iNo < 0):
        iNo = -iNo
    for iCnt in range (2 , (iNo //2) +1 ):
        if(iNo %iCnt == 0):
            bFLaf = False
            break
    return bFLaf

def main():
  
    bRet = False
    ivalue =int(input("Enter the nos"))
    bret = False
    
    bret = checkprime(ivalue)
    
    
    if(bret == True):
        print(f"{ivalue} is a prime number ")
        
    else:
        print(f"{ivalue} is not a prime nos ")
        
if (__name__ == "__main__"):
    main()
    

            