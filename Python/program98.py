class ArrayX:
    def display(self, brr):
        for val in brr:
            print(val)

def main():
    # User Input for size
    size = int(input("Enter the size of array: "))
    
    arr = []
    print("Enter the elements: ")
    for _ in range(size):
        arr.append(int(input()))
    
    aobj = ArrayX()
    aobj.display(arr)

if __name__ == "__main__":
    main()