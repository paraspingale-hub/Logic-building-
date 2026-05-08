class Number:
    def check_perfect(self, i_no: int) -> bool:
        i_sum = 0
        
        if i_no < 0:
            i_no = -i_no
            
        # Reverse loop equivalent (from i_no // 2 down to 1)
        # Note: iSum < iNo check is included inside the loop
        for i in range(i_no // 2, 0, -1):
            if i_sum >= i_no:
                break
            if (i_no % i) == 0:
                i_sum += i
                
        return i_sum == i_no

def main():
    print("Enter number: ")
    try:
        i_value = int(input())
        
        nobj = Number()
        b_ret = nobj.check_perfect(i_value)
        
        if b_ret:
            print(f"{i_value} is a perfect number")
        else:
            print(f"{i_value} is not a perfect number")
    except ValueError:
        print("Invalid input. Please enter an integer.")

if __name__ == "__main__":
    main()