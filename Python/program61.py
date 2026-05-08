def main():
    iNo = 7236
    iDigit = 0

    # First digit
    iDigit = iNo % 10
    print(iDigit)
    iNo = iNo // 10
    print(iNo)

    # Second digit
    iDigit = iNo % 10
    print(iDigit)
    iNo = iNo // 10
    print(iNo)
    
    # Third digit
    iDigit = iNo % 10
    print(iDigit)
    iNo = iNo // 10
    print(iNo)
    
    # Fourth digit
    iDigit = iNo % 10
    print(iDigit)
    iNo = iNo // 10
    print(iNo)
    
if __name__ == "__main__":
    main()