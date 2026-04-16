def display(i_no):
    # Start at 2, increment by 2
    for i_cnt in range(2, i_no + 1, 2):
        print(f"{i_cnt}\t", end="")
    print()

if __name__ == "__main__":
    try:
        i_value = int(input("Please enter frequency : \n"))
        display(i_value)
    except ValueError:
        print("Invalid input!")