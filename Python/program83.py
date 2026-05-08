class PerfectNumberChecker:
    def __init__(self, iNo):
        self.iNo = iNo
        
    def is_perfect(self):
        # A perfect number must be positive
        if self.iNo <= 0:
            return False
            
        running_sum = 0
        # Factors only exist up to n/2
        for i in range(1, (self.iNo // 2) + 1):
            if self.iNo % i == 0:
                running_sum += i
                
                # Early exit optimization
                if running_sum > self.iNo:
                    break
        
        return running_sum == self.iNo
            
def main():
    try:
        iValue = int(input("Enter the number: "))
        
        # Create object
        checker = PerfectNumberChecker(iValue)
        
        # Call the method and check the result
        if checker.is_perfect():
            print(f"{iValue} is a Perfect Number")
        else:
            print(f"{iValue} is NOT a Perfect Number")
            
    except ValueError:
        print("Invalid input. Please enter an integer.")

if __name__ == "__main__":
    main()