def strlenX(string):
    count = 0
    for _ in string:
        count += 1
    return count

arr = input("Enter string: ")

ret = strlenX(arr)

print("String length is:", ret)