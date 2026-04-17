# factors of 6

# Wrong approach
def display_factors(i_no):
    if (i_no % 1) == 0:
        print("1")
    if (i_no % 2) == 0:
        print("2")
    if (i_no % 3) == 0:
        print("3")
    if (i_no % 4) == 0:
        print("4")
    if (i_no % 5) == 0:
        print("5")

if __name__ == "__main__":
    i_value = int(input("Enter number : \n"))
    display_factors(i_value)