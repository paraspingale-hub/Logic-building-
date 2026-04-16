# program17.py
def is_even_odd(i_no: int) -> bool:
    # Returns True if even, False if odd
    return (i_no % 2) == 0

def main():
    i_value = int(input("Enter number : "))
    
    if is_even_odd(i_value):
        print(f"{i_value} is Even number")
    else:
        print(f"{i_value} is Odd number")

if __name__ == "__main__":
    main()