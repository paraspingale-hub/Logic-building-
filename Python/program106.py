class ArrayX:
    def __init__(self, no):
        print("Inside Constructor")
        # In Python, we use __ to suggest "private" access
        self.__i_size = no
        self.__arr = [0] * self.__i_size

    def accept(self):
        print("Enter the elements of array : ")
        for i in range(self.__i_size):
            self.__arr[i] = int(input())

    def display(self):
        print("Elements of the array are : ")
        for val in self.__arr:
            print(val)

def main():
    aobj1 = ArrayX(5)
    
    # In Java program106, these lines would cause a compile error
    # In Python, we follow the convention and don't access __i_size directly.
    # aobj1.__i_size = 11  <- This would create a new variable instead of modifying the internal one.

if __name__ == "__main__":
    main()