def count_even(arr):
    count = 0
    for num in arr:
        if num % 2 == 0:
            count += 1
    return count