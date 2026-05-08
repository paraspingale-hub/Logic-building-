import sys

def get_factors(n):
    """Calculates all factors of a given integer."""
    factors = []
    # A number n is divisible by i if the remainder is 0
    for i in range(1, n + 1):
        if n % i == 0:
            factors.append(i)
    return factors

def main():
    print("--- Factor Calculator ---")
    
    # Python doesn't need a formal 'BufferedReader' object for standard input, 
    # but sys.stdin.readline() mimics that buffered behavior.
    try:
        print("Enter a positive integer: ", end="", flush=True)
        
        # Reading from the standard input stream
        line = sys.stdin.readline()
        
        if not line:
            raise EOFError("No input detected.")
            
        # Attempting to convert input to integer
        number = int(line.strip())
        
        if number <= 0:
            print("Please enter a positive integer greater than zero.")
        else:
            factors_list = get_factors(number)
            print(f"The factors of {number} are: {factors_list}")

    except ValueError:
        print("Error: Invalid input. Please enter a whole number (integer).")
    except EOFError as e:
        print(f"\nError: {e}")
    except Exception as e:
        # Catch-all for unexpected issues
        print(f"An unexpected error occurred: {e}")
    finally:
        print("Exiting program.")

if __name__ == "__main__":
    main()