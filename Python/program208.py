filename = input("Enter the name of file: ")

try:
    with open(filename, "r") as file:
        data = file.read(7)
        print(f"{len(data)} bytes gets successfully read")
        print("Data from file")
        print(data)
except FileNotFoundError:
    print("Unable to open")