try:
    file = open("PPA.txt", "w")
    print(f"File successfully created with fd : {file.fileno()}")
    file.close()
except Exception:
    print("Unable to create file")