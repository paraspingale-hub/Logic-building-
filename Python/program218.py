def count_a(string):
    count = 0

    for ch in string:
        if ch == 'a':
            count += 1

    return count

arr = input("Enter string: ")

ret = count_a(arr)

print("Count of a is:", ret)