

# Input :  6
# Output : 6   5   4   3   2   1

def display(i_no):
    for i in range(i_no, 0, -1):
        print(i, end="\t")
    print()

if __name__ == "__main__":
    i_value = int(input("Enter the frequency : "))
    display(i_value)