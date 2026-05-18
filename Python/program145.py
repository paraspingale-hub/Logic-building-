def find_maximum(arr):
    # Protect against empty lists
    if not arr:
        return None
        
    # Correct initialization (Program 145 logic)
    max_val = arr[0]
    
    for num in arr:
        if num > max_val:
            max_val = num
            
    return max_val

if __name__ == "__main__":
    length = int(input("Enter the number of elements : \n"))
    ptr = []
    
    print("Enter the values : ")
    for _ in range(length):
        ptr.append(int(input()))
        
    result = find_maximum(ptr)
    print(f"Maximum number is : {result}")