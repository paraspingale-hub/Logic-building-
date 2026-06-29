def count_occurrence(string, ch):
    count = 0

    for c in string:
        if c == ch:
            count += 1

    return count

arr = input("Enter string: ")

ret = count_occurrence(arr, 'd')

print("Number of occurrences are:", ret)