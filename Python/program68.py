def calculations(iNo):
    
    while iNo != 0:

        iDigit = 0
        print("--------------------------------------------------")
        iDigit = iNo % 10
        print(iDigit)
        iNo = iNo // 10
        print(iNo)
        print("--------------------------------------------------")



def main():
    iValue = int(input("Enter the nos "))
    iRet = calculations(iValue)
    
if __name__ == "__main__":
    main()