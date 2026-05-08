class ArrayX:
    def display(self, brr):
        print("Elements of the array are:")
        for val in brr:
            print(val)

    def count_even(self, brr):
        count = 0
        for val in brr:
            if val % 2 == 0:
                count += 1
        return count

    def summation(self, brr):
        total = 0
        for val in brr:
            total += val
        return total

def main():
    size = int(input("Enter the size of array: "))
    arr = [int(input(f"Enter element {i+1}: ")) for i in range(size)]

    aobj = ArrayX()
    aobj.display(arr)

    print(f"Even elements are: {aobj.count_even(arr)}")
    print(f"Addition of all elements: {aobj.summation(arr)}")

if __name__ == "__main__":
    main()