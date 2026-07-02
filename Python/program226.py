def count_occurrence(string, ch):
    count = 0
    for c in string:
        if c == ch:
            count += 1
    return count


string = input("Enter string: ")
ch = input("Enter the character: ")

result = count_occurrence(string, ch)
print("Number of occurrences are:", result)