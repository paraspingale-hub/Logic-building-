def check_prime(number):
    # Handle negative numbers by converting to positive
    if number < 0:
        number = -number

    # Numbers 0 and 1 are not prime
    if number < 2:
        return False

    frequency = 0

    # Loop from 2 to number / 2
    # In Python, // is used for integer division
    for i in range(2, (number // 2) + 1):
        if number % i == 0:
            frequency += 1
            # Optimization: We can break early if a factor is found
            break 

    if frequency == 0:
        return True
    else:
        return False

def main():
    try:
        value = int(input("Enter the number : "))
        
        result = check_prime(value)

        if result:
            print(f"{value} is a prime number")
        else:
            print(f"{value} is not a prime number")
    except ValueError:
        print("Invalid input. Please enter an integer.")

if __name__ == "__main__":
    main()