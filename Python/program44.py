def check_divisible(i_no1, i_no2):
    if (i_no1 % i_no2) == 0:
        return True
    else:
        return False

if __name__ == "__main__":
    i_value1 = int(input("Enter first number : \n"))
    i_value2 = int(input("Enter second number : \n"))

    b_ret = check_divisible(i_value1, i_value2)

    if b_ret == True:
        print("It is completely devisible")
    else:
        print("It is not divisible")