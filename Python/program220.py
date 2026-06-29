def count_A(string):
    count = 0

    for ch in string:
        if ch == 'A':
            count += 1

    return count

arr = input("Enter string: ")

ret = count_A(arr)

print("Count of A is:", ret)