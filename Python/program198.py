import os

try:
    os.remove("PPA.txt")
    print("File deleted successfully")
except FileNotFoundError:
    print("File does not exist")