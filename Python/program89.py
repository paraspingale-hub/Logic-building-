class Number:
    def calculate_factorial(self, i_no: int) -> int:
        i_fact = 1
        if i_no < 0:
            i_no = -i_no
            
        i = 1
        while i <= i_no:
            i_fact *= i
            i += 1
        return i_fact

def main():
    print("Enter number: ")
    i_value = int(input())
    
    nobj = Number()
    i_ret = nobj.calculate_factorial(i_value)
    print(f"Factorial is : {i_ret}")

if __name__ == "__main__":
    main()