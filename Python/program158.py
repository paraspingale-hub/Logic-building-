

# Input :  6
# Output : -6   -5   -4   -3  -2   -1  0

def display(i_no):
    for i in range(-i_no, 1):
        print(i, end="\t")
    print()

if __name__ == "__main__":
    i_value = int(input("Enter the frequency : "))
    display(i_value)