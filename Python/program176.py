def display(i_no):
    ch = 'A'
    for i_cnt in range(1, i_no + 1):
        print(ch)
        ch = chr(ord(ch) + 1)
    print()

i_value = int(input("Enter the frequency: "))
display(i_value)