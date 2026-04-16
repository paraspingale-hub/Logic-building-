# program11.py
def addition_two_numbers(f_no1: float, f_no2: float) -> float:
    # If the input is negative then convert it into positive
    if f_no1 < 0.0:
        f_no1 = -f_no1
        
    if f_no2 < 0.0:
        f_no2 = -f_no2
        
    return f_no1 + f_no2

def main():
    try:
        val1 = float(input("Enter first number : "))
        val2 = float(input("Enter second number : "))
        
        result = addition_two_numbers(val1, val2)
        print(f"Addition is : {result}")
    except ValueError:
        print("Invalid input. Please enter numbers.")

if __name__ == "__main__":
    main()