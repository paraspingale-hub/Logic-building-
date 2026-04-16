# program6.py
def add(a, b):
    sum_val = a + b  # Business Logic
    return sum_val

def main():
    print("Enter first number : ")
    i = int(input())

    print("Enter second number : ")
    j = int(input())
    
    ans = add(i, j)
    print(f"Addition is : {ans}")

if __name__ == "__main__":
    main()