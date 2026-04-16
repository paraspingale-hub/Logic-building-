# program9.py
def addition_two_numbers(f_no1, f_no2):
    # Updator: Convert negative to positive
    if f_no1 < 0.0:
        f_no1 = -f_no1

    if f_no2 < 0.0:
        f_no2 = -f_no2

    f_sum = f_no1 + f_no2  # Business Logic
    return f_sum

def main():
    print("Enter first number : ")
    f_value1 = float(input())

    print("Enter second number : ")
    f_value2 = float(input())
    
    f_ret = addition_two_numbers(f_value1, f_value2)
    print(f"Addition is : {f_ret}")

if __name__ == "__main__":
    main()