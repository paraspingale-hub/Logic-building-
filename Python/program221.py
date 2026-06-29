def count_aA(string):
    count = 0

    for ch in string:
        if ch == 'A' or ch == 'a':
            count += 1

    return count

arr = input("Enter string: ")

ret = count_aA(arr)

print("Count of a is:", ret)