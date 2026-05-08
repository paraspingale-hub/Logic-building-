class PerfectChecker:
    def __init__(self, iNo):
        self.iNo = iNo

    def check_perfect(self):
        # Edge case: Perfect numbers are positive integers
        if self.iNo < 2:
            return False
            
        iSum = 0
        i = 1
        limit = self.iNo // 2
        
        # Integrating the early exit directly into the loop condition
        # Loop continues ONLY if we haven't checked all factors AND sum is still valid
        while i <= limit and iSum <= self.iNo:
            if self.iNo % i == 0:
                iSum += i
            i += 1
            
        return iSum == self.iNo

def main():
    try:
        val = int(input("Enter the number to check: "))
        obj = PerfectChecker(val)
        
        if obj.check_perfect():
            print(f"{val} is a Perfect Number.")
        else:
            print(f"{val} is not a Perfect Number.")
            
    except ValueError:
        print("Invalid input. Please enter an integer.")

if __name__ == "__main__":
    main()