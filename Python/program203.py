file_name = input("Enter the name of file: ")

try:
    with open(file_name, "r+") as file:
        data = "India is my country"
        bytes_written = file.write(data[:11])
        print(f"{bytes_written} bytes gets successfully written")
except FileNotFoundError:
    print("Unable to open")