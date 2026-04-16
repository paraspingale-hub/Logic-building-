# program7.py
def addition_two_numbers(i_no1, i_no2):
    i_sum = i_no1 + i_no2  # Business Logic
    return i_sum

def main():
    print("Enter first number : ")
    i_value1 = int(input())

    print("Enter second number : ")
    i_value2 = int(input())
    
    i_ret = addition_two_numbers(i_value1, i_value2)
    print(f"Addition is : {i_ret}")

if __name__ == "__main__":
    main()