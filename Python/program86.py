class Number:
    def calculate_factorial(self, i_no: int) -> int:
        i_fact = 1
        for i in range(1, i_no + 1):
            i_fact *= i
        return i_fact

def main():
    print("Enter number: ")
    i_value = int(input())
    
    nobj = Number()
    i_ret = nobj.calculate_factorial(i_value)
    print(f"Factorial is : {i_ret}")

if __name__ == "__main__":
    main()