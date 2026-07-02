def count_small(string):
    count = 0
    for ch in string:
        if 'a' <= ch <= 'z':
            count += 1
    return count


string = input("Enter string: ")

result = count_small(string)
print("Number of small characters are:", result)