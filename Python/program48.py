# factors of 6

def display_factors(i_no):
    # Time Complexity : O(N)
    if i_no < 0:
        i_no = -i_no

    for i_cnt in range(1, i_no):
        if (i_no % i_cnt) == 0:
            print(i_cnt)

if __name__ == "__main__":
    i_value = int(input("Enter number : \n"))
    display_factors(i_value)