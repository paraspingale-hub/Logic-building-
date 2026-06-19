try:
    with open("PPA.txt", "w") as file:
        pass
    print("File successfully created")
except Exception:
    print("Unable to create file")