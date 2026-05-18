def linear_search(arr, target):
    for num in arr:
        if num == target:
            return True  # Early return is highly encouraged in Python!
    return False

if __name__ == "__main__":
    length = int(input("Enter the number of elements : \n"))
    ptr = []
    
    print("Enter the values : ")
    for _ in range(length):
        ptr.append(int(input()))
        
    value = int(input("Enter the number to search : \n"))
    
    if linear_search(ptr, value):
        print(f"{value} is present in the data")
    else:
        print(f"{value} is not present in the data")