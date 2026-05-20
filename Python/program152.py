

# Input : 5
# Output : * * * * *

def display(i_no):
    for i in range(1, i_no + 1):
        print("*", end="\t")
    print()

if __name__ == "__main__":
    i_value = int(input("Enter the frequency : "))
    display(i_value)