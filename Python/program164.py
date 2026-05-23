def display(i_row, i_col):
    for i in range(i_row):
        for j in range(i_col):
            print("*", end="\t")
        print()

i_value1 = int(input("Enter the number of rows: "))
i_value2 = int(input("Enter the number of columns: "))
display(i_value1, i_value2)