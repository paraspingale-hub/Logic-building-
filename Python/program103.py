class ArrayX:
    def __init__(self, size):
        print("Inside Constructor")
        self.size = size
        # Initialize list with zeros
        self.arr = [0] * self.size

    def accept(self):
        print(f"Enter the {self.size} elements of array:")
        for i in range(self.size):
            self.arr[i] = int(input())

    def display(self):
        print("Elements of the array are:")
        for val in self.arr:
            print(val)

def main():
    # Creating objects with different sizes
    aobj1 = ArrayX(5)
    aobj1.accept()
    aobj1.display()

    aobj2 = ArrayX(7)
    # aobj2 can also accept and display independently

if __name__ == "__main__":
    main()