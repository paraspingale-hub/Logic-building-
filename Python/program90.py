class Digit:
    def display_digits(self, i_no: int):
        # Handle negative numbers to match Java logic behavior
        if i_no < 0:
            i_no = -i_no
            
        while i_no != 0:
            i_digit = i_no % 10
            print(i_digit)
            i_no //= 10 # Integer division

def main():
    print("Enter number: ")
    i_value = int(input())
    
    dobj = Digit()
    dobj.display_digits(i_value)

if __name__ == "__main__":
    main()