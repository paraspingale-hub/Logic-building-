def change(string):
    return string.replace('a', '_')


string = input("Enter string: ")

updated = change(string)

print("Updated string is:", updated)