def display(i_no):
    ch = 'A'
    for i_cnt in range(1, i_no + 1):
        if i_cnt % 2 == 0:
            print(ch, end="\t")
            ch = chr(ord(ch) + 1)
        else:
            print(i_cnt, end="\t")
    print()

i_value = int(input("Enter the frequency: "))
display(i_value)