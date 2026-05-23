def display(i_no):
    ch = 'a'
    for i_cnt in range(1, i_no + 1):
        print(ch, end="\t")
        ch = chr(ord(ch) + 1)
    print()

i_value = int(input("Enter the frequency: "))
display(i_value)