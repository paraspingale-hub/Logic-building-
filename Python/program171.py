def display(i_no):
    i = 96
    for i_cnt in range(1, i_no + 1):
        print(i + i_cnt, end="\t")
    print()

i_value = int(input("Enter the frequency: "))
display(i_value)