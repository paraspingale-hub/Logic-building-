def calculations():
    
    while iNo != 0:
        iNo = 7236
        iDigit = 0
        print("--------------------------------------------------")
        iDigit = iNo % 10
        print(iDigit)
        iNo = iNo // 10
        print(iNo)
        print("--------------------------------------------------")



def main():
    calculations()
    
if __name__ == "__main__":
    main()