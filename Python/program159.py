

# Input :  6
# Output : 0   1   2   3   4   5   6   

def display(i_no):
    for i in range(0, i_no + 1):
        print(i, end="\t")
    print()

if __name__ == "__main__":
    i_value = int(input("Enter the frequency : "))
    display(i_value)