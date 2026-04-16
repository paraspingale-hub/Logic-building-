def display(i_frequency: int):
    # Filter for negative input
    if i_frequency < 0:
        print("Invalid input")
        return

    for i_cnt in range(1, i_frequency + 1):
        print("Jay Ganesh...")

def main():
    i_count = int(input("Enter the frequency : "))
    display(i_count)

if __name__ == "__main__":
    main()