a = [1, 2, 3]
b = a  # b is now a "pointer" to the same list as a
b.append(4)
print(a)  # Output: [1, 2, 3, 4]
print(id(a) == id(b))  # Output: True

