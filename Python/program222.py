def count_vowels(string):
    count = 0

    for ch in string:
        if ch in "aeiou":
            count += 1

    return count

arr = input("Enter string: ")

ret = count_vowels(arr)

print("Number of vowels are:", ret)