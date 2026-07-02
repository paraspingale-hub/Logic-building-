def count_all(string):
    small = 0
    capital = 0

    for ch in string:
        if 'A' <= ch <= 'Z':
            capital += 1
        else:
            small += 1

    print("Number of small characters:", small)
    print("Number of capital characters:", capital)


string = input("Enter string: ")
count_all(string)