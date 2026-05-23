def display(i_no):
    i = 97
    for i_cnt in range(1, i_no + 1):
        print(i, end="\t")
        i += 1
    print()

i_value = int(input("Enter the frequency: "))
display(i_value)