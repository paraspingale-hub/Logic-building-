class Digit:
    def sum_digits(self, i_no: int) -> int:
        i_sum = 0
        if i_no < 0:
            i_no = -i_no
            
        while i_no != 0:
            i_digit = i_no % 10
            i_sum += i_digit
            i_no //= 10
        return i_sum

def main():
    print("Enter number: ")
    i_value = int(input())
    
    dobj = Digit()
    i_ret = dobj.sum_digits(i_value)
    print(f"Addition of digits : {i_ret}")

if __name__ == "__main__":
    main()