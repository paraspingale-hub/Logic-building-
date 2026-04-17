def display(i_no):
    # Time Complexity : O(N)
    for i_cnt in range(1, i_no + 1):
        if (i_cnt % 2) == 0:
            print(i_cnt, end="\t")
    print()

if __name__ == "__main__":
    i_value = int(input("Please enter frequency : \n"))
    display(i_value)