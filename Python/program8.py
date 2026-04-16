# program8.py
"""
    Step 1 to 5: (Same logic as C version)
"""

def addition_two_numbers(f_no1, f_no2):
    f_sum = f_no1 + f_no2  # Business Logic
    return f_sum

def main():
    # float() in Python handles decimals
    print("Enter first number : ")
    f_value1 = float(input())

    print("Enter second number : ")
    f_value2 = float(input())
    
    f_ret = addition_two_numbers(f_value1, f_value2)
    print(f"Addition is : {f_ret}")

if __name__ == "__main__":
    main()