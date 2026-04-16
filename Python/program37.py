def display(i_no):
    for i_cnt in range(1, i_no + 1):
        print(f"{i_cnt}\t", end="")
    print()

if __name__ == "__main__":
    try:
        i_value = int(input("Please enter frequency : \n"))
        display(i_value)
    except ValueError:
        print("Invalid input! Please enter an integer.")