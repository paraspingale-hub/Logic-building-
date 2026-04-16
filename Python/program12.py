# program12.py
def check_even_odd(i_no: int):
    if i_no % 2 == 0:
        print("It is Even number")
    else:
        print("It is Odd number")

i_value = int(input("Enter number : "))
check_even_odd(i_value)