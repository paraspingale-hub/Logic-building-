if __name__ == "__main__":
    length = int(input("Enter the number of elements: "))
    ptr = []
    
    print("Enter the values:")
    for _ in range(length):
        ptr.append(int(input()))

    # The Pythonic Way to find frequency
    result = ptr.count(11)
    
    print(f"Frequency of 11 is : {result}")