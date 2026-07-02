def count_digits(string):
    count = 0

    for ch in string:
        if '0' <= ch <= '9':
            count += 1

    print("Number of digits:", count)


string = input("Enter string: ")
count_digits(string)