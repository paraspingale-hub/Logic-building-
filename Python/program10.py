# program10.py
"""
    Step 1 : Understand the problem statement
    Step 2 : Write the algorithm
    Step 3 : Decide the programming language
    Step 4 : Write the program
    Step 5 : Test the program
"""

#################################################################
#
#  Function Name : addition_two_numbers
#  Description   : It is used to perform addition         
#  Input         : Float, Float 
#  Output        : Float
#  Author        : Piyush Manohar Khairnar (Python Port)
#
#################################################################

def addition_two_numbers(f_no1, f_no2):
    # Updator
    if f_no1 < 0.0:
        f_no1 = -f_no1

    if f_no2 < 0.0:
        f_no2 = -f_no2

    f_sum = f_no1 + f_no2  # Business Logic
    return f_sum

#################################################################
#
#  Entry point function for the application
#
#################################################################

def main():
    try:
        print("Enter first number : ")
        f_value1 = float(input())

        print("Enter second number : ")
        f_value2 = float(input())
        
        f_ret = addition_two_numbers(f_value1, f_value2)
        print(f"Addition is : {f_ret}")
        
    except ValueError:
        print("Invalid input! Please enter numeric values.")

if __name__ == "__main__":
    main()

#################################################################
#
#  Testcases successfully handled by the application
#
#  Input1 : 10.5       Input2 : 3.2        Output : 13.7
#  Input1 : -10.5      Input2 : 3.2        Output : 13.7
#  Input1 : 10.5       Input2 : -3.2       Output : 13.7
#  Input1 : -10.5      Input2 : -3.2       Output : 13.7
#  Input1 : 10.5       Input2 : 0.0        Output : 10.5
#
#################################################################