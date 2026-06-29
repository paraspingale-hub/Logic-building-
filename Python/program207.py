filename = input("Enter the name of file: ")

try:
    with open(filename, "r") as file:
        data = file.read(7)
        print(f"{len(data)} bytes gets successfully read")
        print("Data from file :", data)
except FileNotFoundError:
    print("Unable to open")