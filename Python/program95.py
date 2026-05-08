# Equivalent to program95.java and program96.java
def main():
    # Initializing a list with 4 elements (all set to 0)
    arr = [0] * 4
    print(f"Number of elements : {len(arr)}")

    # Assigning values (program96 logic)
    arr[0] = 10
    arr[1] = 20
    arr[2] = 30
    arr[3] = 40

    # Displaying values
    for val in arr:
        print(val)

if __name__ == "__main__":
    main()