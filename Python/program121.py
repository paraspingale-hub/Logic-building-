def display(arr):
    for i in range(7):
        print(arr[i]) # Will crash on the 5th iteration

if __name__ == "__main__":
    brr = [10, 20, 30, 40]
    display(brr)