def display(i_row, i_col):
    for i in range(1, i_row + 1):
        for j in range(1, i_col + 1):
            if i % 2 == 0:
                print(i, end="\t")
            else:
                print("*", end="\t")
        print()

i_value1 = int(input("Enter number of rows: "))
i_value2 = int(input("Enter number of columns: "))
display(i_value1, i_value2)