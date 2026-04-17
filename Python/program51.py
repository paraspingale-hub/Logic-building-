def count_factors(i_no):
    i_frequency = 0

    if i_no < 0:
        i_no = -i_no

    # We use integer division (//) because range() requires integers
    for i_cnt in range(1, (i_no // 2) + 1):
        if (i_no % i_cnt) == 0:
            i_frequency += 1

    return i_frequency

if __name__ == "__main__":
    i_value = int(input("Enter the number : \n"))
    i_ret = count_factors(i_value)
    print(f"Number of factors are : {i_ret}")