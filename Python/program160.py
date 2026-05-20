

# Input :  5
# Output : -5  -4  -3  -2  -1  0   1   2   3   4   5

def display(i_no):
    # Mimicking the two separate loops exactly as written in the Java file
    for i in range(-i_no, 1):
        print(i, end="\t")
        
    for i in range(1, i_no + 1):
        print(i, end="\t")
        
    print()

if __name__ == "__main__":
    i_value = int(input("Enter the frequency : "))
    display(i_value)