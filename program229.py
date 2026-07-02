def count_capital(string):
    count = 0
    for ch in string:
        if 'A' <= ch <= 'Z':
            count += 1
    return count


string = input("Enter string: ")

result = count_capital(string)
print("Number of capital characters are:", result)