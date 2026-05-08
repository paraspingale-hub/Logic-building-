class ArrayX:
    def __init__(self, no):
        print("Inside Constructor")
        self.__i_size = no
        self.__arr = [0] * self.__i_size

    def accept(self):
        print(f"Enter the {self.__i_size} elements of array : ")
        for i in range(self.__i_size):
            self.__arr[i] = int(input())

    def display(self):
        print("Elements of the array are : ")
        for val in self.__arr:
            print(val)

def main():
    # Object 1 handling 5 elements
    aobj1 = ArrayX(5)
    aobj1.accept()
    aobj1.display()

    # Object 2 handling 7 elements
    aobj2 = ArrayX(7)
    aobj2.accept()
    aobj2.display()

if __name__ == "__main__":
    main()