class ArrayX:
    def display(self, brr):
        for i in range(len(brr)):
            print(brr[i])

def main():
    arr = [10, 20, 30, 40]
    aobj = ArrayX()
    aobj.display(arr)

if __name__ == "__main__":
    main()