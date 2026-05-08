def main():
    iNo = 7236
    iDigit = 0

    # First digit
    
    while iNo != 0:
        
        print("--------------------------------------------------")
        iDigit = iNo % 10
        print(iDigit)
        iNo = iNo // 10
        print(iNo)
        print("--------------------------------------------------")


    
if __name__ == "__main__":
    main()