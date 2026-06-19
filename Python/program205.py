file_name = input("Enter the name of file: ")

try:
    with open(file_name, "r") as file:
        data = file.read(5)
        print(f"{len(data)} bytes gets successfully read")
        print("Data from file :", data)
except FileNotFoundError:
    print("Unable to open")