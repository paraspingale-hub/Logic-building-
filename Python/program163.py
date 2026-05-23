def display(i_no):
    for i_cnt in range(1, i_no + 1):
        if i_cnt % 2 == 0:
            print("*", end="\t")
        else:
            print((i_cnt // 2) + 1, end="\t")
    print()

i_value = int(input("Enter the frequency: "))
display(i_value)