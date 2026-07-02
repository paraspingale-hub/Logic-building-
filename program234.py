def count_spaces(string):
    count = 0

    for ch in string:
        if ch == ' ':
            count += 1

    print("Number of spaces:", count)


string = input("Enter string: ")
count_spaces(string)