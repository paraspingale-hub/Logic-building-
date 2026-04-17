# factors of 6

def display_factors(i_no):
    # Time Complexity : O(N/2)
    if i_no < 0:
        i_no = -i_no

    # We use integer division (//) because range() requires integers
    for i_cnt in range(1, (i_no // 2) + 1):
        if (i_no % i_cnt) == 0:
            print(i_cnt)

if __name__ == "__main__":
    i_value = int(input("Enter number : \n"))
    display_factors(i_value)