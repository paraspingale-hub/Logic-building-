def main():
    iNo = 7236
    iDigit = 0

    # First digit
    iDigit = iNo % 10
    print(iDigit)
    iNo = iNo // 10

    # Second digit
    iDigit = iNo % 10
    print(iDigit)
    iNo = iNo // 10

    # Third digit
    iDigit = iNo % 10
    print(iDigit)
    iNo = iNo // 10

    # Fourth digit
    iDigit = iNo % 10
    print(iDigit)
    iNo = iNo // 10

if __name__ == "__main__":
    main()