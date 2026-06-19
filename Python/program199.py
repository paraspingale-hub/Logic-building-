file_name = input("Enter the name of file that you want create: ")

try:
    file = open(file_name, "w")
    print(f"File successfully created with fd : {file.fileno()}")
    file.close()
except Exception:
    print("Unable to create file")