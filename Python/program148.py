def update(arr):
    # We must use indices to modify the list in-place
    for i in range(len(arr)):
        arr[i] += 1

if __name__ == "__main__":
    length = int(input("Enter the number of elements : \n"))
    ptr = []
    
    print("Enter the values : ")
    for _ in range(length):
        ptr.append(int(input()))
        
    update(ptr)
    
    print("Updated data from array is : ")
    for num in ptr:
        print(num)