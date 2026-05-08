class ArrayX:
    def __init__(self, no):
        print("Inside Constructor")
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

    def average(self) -> float:
        i_sum = 0
        for val in self.__arr:
            i_sum += val
        
        # Java uses (iSum / iSize) which is integer division.
        # For a true average in Python, we use the / operator.
        return i_sum / self.__i_size

def main():
    aobj1 = ArrayX(5)
    aobj1.accept()
    aobj1.display()

    f_ret = aobj1.average()
    print(f"Average is : {f_ret}")

if __name__ == "__main__":
    main()