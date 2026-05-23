def display(i_no):
    for i_cnt in range(-i_no, i_no + 1):
        print(i_cnt, end="\t")
    print()

i_value = int(input("Enter the frequency: "))
display(i_value)