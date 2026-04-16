def display(i_no):
    # range stops at -1 to include 0
    for i_cnt in range(i_no, -1, -1):
        print(f"{i_cnt}\t", end="")
    print()

if __name__ == "__main__":
    try:
        i_value = int(input("Please enter frequency : \n"))
        display(i_value)
    except ValueError:
        print("Invalid input!")