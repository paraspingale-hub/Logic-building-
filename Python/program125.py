def display(arr, size):
    for i in range(size):
        print(arr[i])

if __name__ == "__main__":
    # Get user input for the size
    length = int(input("Enter number of elements : "))
    
    # Python dynamically allocates this list. No malloc() or NULL checks required.
    ptr = [] 
    
    print("Enter the elements : ")
    for i in range(length):
        # Read user input and append it to the dynamically resizing list
        element = int(input())
        ptr.append(element)
        
    display(ptr, length)
    
    # No free(ptr) is needed. Python's Garbage Collector handles it automatically 
    # when the program ends or 'ptr' goes out of scope.