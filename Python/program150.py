def reverse_display(arr):
    # Start at the last index, stop before -1, step by -1
    for i in range(len(arr) - 1, -1, -1):
        print(arr[i])