def display_pattern(iRow, iCol):
    # Filter for square matrix
    if iRow != iCol:
        print("Invalid Input")
        print("Row number and column number should be same")
        return

    for i in range(1, iRow + 1):
        for j in range(1, iCol + 1):
            # Checking the condition inside the full loop
            if i >= j:
                print("*", end="\t")   
        print()

if __name__ == "__main__":
    iValue1 = int(input("Enter number of rows : "))
    iValue2 = int(input("Enter number of columns : "))
    
    display_pattern(iValue1, iValue2)