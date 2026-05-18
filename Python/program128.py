def summation(arr):
    total = 0
    for num in arr:
        total += num
    return total

if __name__ == "__main__":
    length = int(input("Enter number of elements: "))
    ptr = []
    print("Enter the elements:")
    for _ in range(length):
        ptr.append(int(input()))
        
    result = summation(ptr)
    print(f"Addition is : {result}")