def display_pattern(iRow, iCol):
    for i in range(1, iRow + 1):
        for j in range(1, iCol + 1):
            if i % 2 == 0:
                print(j, end="\t")
            else:
                print(chr(ord('a') + j - 1), end="\t")
        print()

if __name__ == "__main__":
    iValue1 = int(input("Enter number of rows : "))
    iValue2 = int(input("Enter number of columns : "))
    display_pattern(iValue1, iValue2)