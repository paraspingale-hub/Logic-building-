if __name__ == "__main__":
    i_value1 = int(input("Enter first number : \n"))
    i_value2 = int(input("Enter second number : \n"))

    if (i_value1 % i_value2) == 0:
        print("It is completely devisible")
    else:
        print("It is not divisible")