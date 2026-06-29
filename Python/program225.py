def count_occurrence(string, ch):
    count = 0

    for c in string:
        if c == ch:
            count += 1

    return count

arr = input("Enter string: ")

ch = input("Enter the character: ")[0]

ret = count_occurrence(arr, ch)

print("Number of occurrences are:", ret)