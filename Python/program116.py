def display(arr):
    # Python automatically knows it's a list, no pointer syntax needed.
    for i in range(4):
        print(arr[i])

if __name__ == "__main__":
    brr = [10, 20, 30, 40]
    display(brr)