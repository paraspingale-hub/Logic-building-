file_name = input("Enter the name of file that you want open: ")

try:
    file = open(file_name, "r+")
    print(f"File successfully opened with fd : {file.fileno()}")
    file.close()
except FileNotFoundError:
    print("Unable to open file")